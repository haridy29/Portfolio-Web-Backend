package com.example.Portfolio.controllers;

import com.example.Portfolio.dtos.ArticleDTO;
import com.example.Portfolio.dtos.LinkDTO;
import com.example.Portfolio.dtos.ProfileDTO;
import com.example.Portfolio.dtos.ProjectDTO;
import com.example.Portfolio.services.ArticleService;
import com.example.Portfolio.services.LinkService;
import com.example.Portfolio.services.ProfileService;
import com.example.Portfolio.services.ProjectService;
import com.example.Portfolio.views.ProfileView;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {
    private final ArticleService articleService;
    private final ProfileService profileService;
    private final ProjectService projectService;
    private final LinkService linkService;

    @PostMapping("/profile")
    public ResponseEntity<String> updateProfile(@Valid @RequestBody ProfileDTO profile) {
        return profileService.updateProfile(profile);
    }

    @GetMapping("/profile")
    public ProfileView getProfile() {
        return profileService.getProfile();
    }

    @PostMapping("/profile/links")
    public ResponseEntity<String> addLink(@Valid @RequestBody LinkDTO linkDTO) {
        return linkService.addLink(linkDTO);
    }

    @PutMapping("/profile/links/{id}")
    public ResponseEntity<String> editLink(@PathVariable("id") Long linkId, @Valid @RequestBody LinkDTO linkDTO) {
        return linkService.editLink(linkId, linkDTO);
    }

    @DeleteMapping("/profile/links/{id}")
    public ResponseEntity<String> deleteLink(@PathVariable("id") Long linkId) {
        return linkService.deleteLink(linkId);
    }

    @PostMapping("/articles")
    public ResponseEntity<String> addArticle(@Valid @RequestBody ArticleDTO article) {
        return articleService.addArticle(article);

    }


    @DeleteMapping("/articles/{id}")
    public ResponseEntity<String> deleteArticle(@NotNull @PathVariable("id") Long articleId) {
        return articleService.deleteArticle(articleId);
    }

    @PutMapping("/articles/{id}")
    public ResponseEntity<String> editArticle(@NotNull @PathVariable("id") Long articleId, @Valid @RequestBody ArticleDTO article) {
        return articleService.editArticle(articleId, article);
    }

    @PostMapping("/projects")
    public ResponseEntity<String> addProject(@Valid @RequestBody ProjectDTO projectDTO) {
        return projectService.addProject(projectDTO);
    }

    @DeleteMapping("/projects/{id}")
    public ResponseEntity<String> deleteProject(@NotNull @PathVariable("id") Long projectId) {
        return projectService.deleteProject(projectId);
    }

    @PutMapping("/projects/{id}")
    public ResponseEntity<String> editProject(@NotNull @PathVariable("id") Long projectId, @Valid @RequestBody ProjectDTO projectDTO) {
        return projectService.editProject(projectId, projectDTO);
    }


}
