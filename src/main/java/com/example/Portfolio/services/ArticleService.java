package com.example.Portfolio.services;

import com.example.Portfolio.dtos.ArticleDTO;
import com.example.Portfolio.entities.Article;
import com.example.Portfolio.exceptions.NotFoundException;
import org.springframework.http.ResponseEntity;

import java.security.Principal;
import java.util.List;

public interface ArticleService {
    public ResponseEntity<String> addArticle(ArticleDTO article);

    ResponseEntity<String> deleteArticle(Long articleId);

    ResponseEntity<String> editArticle(Long articleId, ArticleDTO article);

    List<Article> getAllArticles();

    Article getArticleById(Long id) throws NotFoundException;
}
