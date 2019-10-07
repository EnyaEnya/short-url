package com.shortUrl.service;

import com.shortUrl.domain.Link;
import com.shortUrl.repository.LinkRepository;
import com.shortUrl.repository.LinkRepositoryImpl;


public class LinkServiceImpl implements LinkService {

    private LinkRepository linkRepository = new LinkRepositoryImpl();

    public void save(Link link) {
        linkRepository.save(link);
    }

}
