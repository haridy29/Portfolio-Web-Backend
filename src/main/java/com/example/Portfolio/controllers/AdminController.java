package com.example.Portfolio.controllers;

import com.example.Portfolio.dtos.ProfileDTO;
import com.example.Portfolio.services.ArticleService;
import com.example.Portfolio.services.ProfileService;
import com.example.Portfolio.views.ProfileView;
import jakarta.validation.Valid;
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

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from secured endpoint.");
    }

    public ResponseEntity<String> updateProfile(Principal principal, @Valid @RequestBody ProfileDTO profile) {
        return profileService.updateProfile(principal, profile);
    }

    @GetMapping("/profile")
    public ProfileView getProfile() {
        return profileService.getProfile();
    }

}
