package com.shortUrl.service;

public interface LinkService {

    String save(String link);

    String createNewLink();

    String getLongLink(String shortLink);
}
