package com.example.Portfolio.services;

import com.example.Portfolio.dtos.ArticleDTO;
import com.example.Portfolio.entities.Article;
import com.example.Portfolio.repositories.AdminRepo;
import com.example.Portfolio.repositories.ArticleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.security.Principal;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepo articleRepo;

    private final AdminService adminService;


    public ResponseEntity<String> addArticle(Principal principal, ArticleDTO article) {
        if (articleRepo.existsByTitle(article.getTitle()))
            return ResponseEntity.ok("Title already exists");

        Article newArticle = new Article(article.getTitle(), article.getBlog(), adminService.getAdminByUsername(principal.getName()).getPersonal_data());
        articleRepo.save(newArticle);
        return ResponseEntity.ok("Success");
    }
}
