package com.example.Portfolio.services;

import com.example.Portfolio.dtos.LinkDTO;
import org.springframework.http.ResponseEntity;

public interface LinkService {
    ResponseEntity<String> addLink(LinkDTO linkDTO);

    ResponseEntity<String> editLink(Long linkId, LinkDTO linkDTO);

    ResponseEntity<String> deleteLink(Long linkId);
}
