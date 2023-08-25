package com.example.Portfolio.controllers;

import com.example.Portfolio.entities.Article;
import com.example.Portfolio.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/")
public class AdminController {

    public final ArticleService articleService;

    public AdminController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("admin/addArticle/{title}/{blog}")
    public Article addAreticle(@PathVariable("title") String title, @PathVariable("blog") String blog) {
        return articleService.addArticle(title, blog);
    }

}
