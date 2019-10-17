package com.shortUrl.service;

import com.shortUrl.domain.ILinkDao;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkServiceImpl implements LinkService {

    @Autowired
    private ILinkDao dao;

    @Override
    public String save(String longLink) {
        String shortLink = createNewLink();
        dao.createItem(longLink, shortLink);
        return shortLink;
    }

    @Override
    public String createNewLink() {
        return RandomStringUtils.random(10, true, true);
    }

    @Override
    public String getLongLink(String shortLink) {
        return dao.getLongLinkByShortLink(shortLink);
    }
}
