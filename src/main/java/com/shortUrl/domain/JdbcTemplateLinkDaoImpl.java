package com.shortUrl.domain;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class JdbcTemplateLinkDaoImpl implements ILinkDao {

    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void createItem(long id, String long_link, String short_link) {
        String SQL = "INSERT INTO links (id, long_link, short_link) VALUES (?,?,?)";

        jdbcTemplate.update(SQL, id, long_link, short_link);
        System.out.println("Item successfully created.\nId: " + id + ";\nLong link: " +
                long_link + ";\nShort link: " + short_link + "\n");
    }

    @Override
    public Link getItemById(long id) {
        String SQL = "SELECT * FROM links WHERE id = ?";
        Link link = (Link) jdbcTemplate.queryForObject(SQL, new Object[]{id}, new LinkMapper());
        return link;
    }

    @Override
    public List listItems() {
        String SQL = "SELECT * FROM links";
        List items = jdbcTemplate.query(SQL, new LinkMapper());
        return items;
    }

    @Override
    public void removeItem(long id) {
        String SQL = "DELETE FROM links WHERE id = ?";
        jdbcTemplate.update(SQL, id);
        System.out.println("Item with id: " + id + " successfully removed");
    }

    @Override
    public void updateItem(long id, String long_link, String short_link) {
        String SQL = "UPDATE links SET long_link = ?, short_link = ? WHERE id = ?";
        jdbcTemplate.update(SQL, long_link, short_link, id);
        System.out.println("Item with id: " + id + " successfully updated.");
    }

}
