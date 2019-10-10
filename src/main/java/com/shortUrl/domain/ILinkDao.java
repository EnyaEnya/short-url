package com.shortUrl.domain;

import javax.sql.DataSource;
import java.util.List;

public interface ILinkDao {

    public void setDataSource(DataSource dataSource);

    public void createItem(long id, String long_link, String short_link);

    public Link getItemById(long id);

    public List listItems();

    public void removeItem(long id);

    public void updateItem(long id, String long_link, String short_link);


}
