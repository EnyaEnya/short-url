package com.shortUrl.domain;

import java.util.List;

public interface ILinkDao {

    public void createItem(String long_link, String short_link);

    public Link getItemById(long id);

    public String getItemByLongLink(String long_link);

    public List listItems();

    public void removeItem(long id);

    public void updateItem(long id, String long_link, String short_link);


}
