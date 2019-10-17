package com.shortUrl.controller;

import com.shortUrl.dto.LinkDto;
import com.shortUrl.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LinkController {

    @Autowired
    private LinkService linkService;

    @GetMapping(value = "/")
    public String links() {
        return "index";
    }

    @PostMapping(value = "/reduce")
    public String addNewLink(LinkDto dto, Model model) {
        String shortLink = linkService.save(dto.getLink());
        model.addAttribute("url", shortLink);
        return "resultPage";
    }

    @GetMapping(value = "/{shortUrl}")
    public String redirect(@PathVariable String shortUrl) {
        String redirectUrl = linkService.getLongLink(shortUrl);
        return "redirect:" + redirectUrl;
    }
}
