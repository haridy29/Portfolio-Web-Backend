package com.example.Portfolio.controllers;

import com.example.Portfolio.dtos.ArticleDTO;
import com.example.Portfolio.dtos.ProfileDTO;
import com.example.Portfolio.services.ArticleService;
import com.example.Portfolio.services.ProfileService;
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


    @PostMapping("/profile")
    public ResponseEntity<String> updateProfile(Principal principal, @Valid @RequestBody ProfileDTO profile) {
        return profileService.updateProfile(principal, profile);
    }

    @GetMapping("/profile")
    public ProfileView getProfile() {
        return profileService.getProfile();
    }

    @PostMapping("/articles")
    public ResponseEntity<String> AddArticle(@Valid @RequestBody ArticleDTO article) {
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
}
