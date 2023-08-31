package com.example.Portfolio.controllers;

import com.example.Portfolio.entities.Article;
import com.example.Portfolio.exceptions.NotFoundException;
import com.example.Portfolio.services.ArticleService;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService articleService;

    @GetMapping("/articles")
    public List<Article> getAllArticles() {
        return articleService.getAllArticles();
    }

    @GetMapping("articles/{id}")
    public Article getArticle(@NotNull @PathVariable("id") Long id) throws NotFoundException {
        return articleService.getArticleById(id);
    }
}
