package com.shortUrl.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class JdbcTemplateLinkDaoImpl implements ILinkDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createItem(String long_link, String short_link) {
        String SQL = "INSERT INTO links (long_link, short_link) VALUES (?,?)";

        jdbcTemplate.update(SQL,long_link, short_link);
        System.out.println("Item successfully created.\nId: " + ";\nLong link: " +
                long_link + ";\nShort link: " + short_link + "\n");
    }

    @Override
    public String getLongLinkByShortLink(String shortLink) {
        String SQL = "SELECT * FROM links WHERE short_link = ?";
        Link link = (Link) jdbcTemplate.queryForObject(SQL, new Object[]{shortLink}, new LinkMapper());
        return link.getLongLink();
    }

}
