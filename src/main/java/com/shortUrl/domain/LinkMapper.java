package com.shortUrl.domain;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LinkMapper implements RowMapper {

    @Override
    public Link mapRow(ResultSet rs, int rowNum) throws SQLException {
        Link item = new Link();
        //item.setId(rs.getLong("id"));
        item.setLongLink(rs.getString("long_link"));
        item.setShortLink(rs.getString("short_link"));
        return item;
    }

}
