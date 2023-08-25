package com.example.Portfolio.services;

import com.example.Portfolio.entities.Article;
import com.example.Portfolio.repositories.ArticleRepo;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {
    public final ArticleRepo articleRepo;

    public ArticleServiceImpl(ArticleRepo articleRepo) {
        this.articleRepo = articleRepo;
    }

    @Override
    public Article addArticle(String title, String blog) {
        Article article = new Article(title, blog);
        return articleRepo.save(article);

    }
}
