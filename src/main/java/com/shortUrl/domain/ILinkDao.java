package com.shortUrl.domain;

public interface ILinkDao {

    public void createItem(String long_link, String short_link);

    public String getLongLinkByShortLink(String long_link);


}
