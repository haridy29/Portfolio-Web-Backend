package com.example.Portfolio.services;

import com.example.Portfolio.dtos.ArticleDTO;
import com.example.Portfolio.entities.Article;
import org.springframework.http.ResponseEntity;

import java.security.Principal;

public interface ArticleService {
    public ResponseEntity<String> addArticle(ArticleDTO article);

    ResponseEntity<String> deleteArticle(Long articleId);

    ResponseEntity<String> editArticle(Long articleId, ArticleDTO article);
}
