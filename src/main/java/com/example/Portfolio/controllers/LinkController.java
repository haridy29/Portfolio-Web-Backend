package com.example.Portfolio.controllers;

import com.example.Portfolio.entities.Link;
import com.example.Portfolio.exceptions.NotFoundException;
import com.example.Portfolio.services.LinkService;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/links")
@RequiredArgsConstructor
public class LinkController {
    private final LinkService linkService;

    @GetMapping("")
    public List<Link> getAllLinks() {
        return linkService.getAllLinks();
    }

    @GetMapping("{id}")
    public Link getLinkById(@NotNull @PathVariable("id") Long linkId) throws NotFoundException {
        return linkService.getLinkById(linkId);
    }

}
