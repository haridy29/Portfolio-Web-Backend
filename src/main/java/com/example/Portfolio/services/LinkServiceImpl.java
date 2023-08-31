package com.example.Portfolio.services;

import com.example.Portfolio.dtos.LinkDTO;
import com.example.Portfolio.entities.Link;
import com.example.Portfolio.exceptions.NotFoundException;
import com.example.Portfolio.repositories.LinkRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LinkServiceImpl implements LinkService {

    private final LinkRepo linkRepo;


    @Override
    public ResponseEntity<String> addLink(LinkDTO linkDTO) {
        Link link = new Link(linkDTO.getSiteName(), linkDTO.getLink());
        linkRepo.save(link);
        return ResponseEntity.ok("Success");
    }

    @Override
    public ResponseEntity<String> editLink(Long linkId, LinkDTO linkDTO) {
        Link link = linkRepo.findById(linkId, Link.class);
        if (link == null) return ResponseEntity.badRequest().body("The link not found");
        link.setSiteName(linkDTO.getSiteName());
        link.setLink(link.getLink());
        linkRepo.save(link);
        return ResponseEntity.ok("Success");
    }

    @Override
    public ResponseEntity<String> deleteLink(Long linkId) {
        Link link = linkRepo.findById(linkId, Link.class);
        if (link == null) return ResponseEntity.badRequest().body("The link not found");
        linkRepo.deleteById(linkId);
        return ResponseEntity.ok("Success");
    }

    @Override
    public List<Link> getAllLinks() {
        return linkRepo.findAll();
    }

    @Override
    public Link getLinkById(Long linkId) throws NotFoundException {
        Link link = linkRepo.findById(linkId, Link.class);
        if (link == null) throw new NotFoundException("The link not found");
        return link;
    }

}
