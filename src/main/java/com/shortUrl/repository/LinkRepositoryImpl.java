package com.shortUrl.repository;

import com.shortUrl.domain.Link;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class LinkRepositoryImpl implements LinkRepository {


    private AtomicInteger counter = new AtomicInteger(1);
    private Integer newId = counter.incrementAndGet();

    private Map<Integer, Link> links = new HashMap<Integer, Link>();

    private List<Integer> keys = new ArrayList<Integer>();

    public void save(Link link) {
        links.put(newId, link);
    }

}
