package com.shortUrl.controller;

import com.shortUrl.domain.Link;
import com.shortUrl.dto.LinkDto;
import com.shortUrl.service.LinkService;
import com.shortUrl.service.LinkServiceImpl;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LinkController {

    private LinkService linkService = new LinkServiceImpl();

    @GetMapping(value = "/")
    public String links() {
        return "index";
    }

    @RequestMapping(value = "/index", method=RequestMethod.POST)
    public String addNewLink(LinkDto dto) {
        Link newLink = new Link();
        newLink.setLink(dto.getLink());
        linkService.save(newLink);
        return "redirect:/";
    }

}
