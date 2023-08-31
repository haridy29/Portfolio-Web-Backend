package com.example.Portfolio.services;

import com.example.Portfolio.dtos.LinkDTO;
import com.example.Portfolio.entities.Link;
import com.example.Portfolio.exceptions.NotFoundException;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface LinkService {
    ResponseEntity<String> addLink(LinkDTO linkDTO);

    ResponseEntity<String> editLink(Long linkId, LinkDTO linkDTO);

    ResponseEntity<String> deleteLink(Long linkId);

    List<Link> getAllLinks();

    Link getLinkById(Long linkId) throws NotFoundException;
}
