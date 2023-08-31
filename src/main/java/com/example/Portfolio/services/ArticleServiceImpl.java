package com.example.Portfolio.services;

import com.example.Portfolio.dtos.ArticleDTO;
import com.example.Portfolio.entities.Article;
import com.example.Portfolio.exceptions.NotFoundException;
import com.example.Portfolio.repositories.ArticleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepo articleRepo;


    public ResponseEntity<String> addArticle(ArticleDTO article) {
        if (articleRepo.existsByTitle(article.getTitle()))
            return ResponseEntity.ok("Title already exists");

        Article newArticle = new Article(article.getTitle(), article.getBlog());
        articleRepo.save(newArticle);
        return ResponseEntity.ok("Success");
    }

    @Override
    public ResponseEntity<String> deleteArticle(Long articleId) {
        if (articleRepo.existsById(articleId)) {
            articleRepo.deleteById(articleId);
            return ResponseEntity.ok("Success");
        }
        return ResponseEntity.badRequest().body("Article not found");
    }

    @Override
    public ResponseEntity<String> editArticle(Long articleId, ArticleDTO articleDto) {
        Article article = articleRepo.findById(articleId, Article.class);
        if (article == null) {
            return ResponseEntity.badRequest().body("Article not found");
        }
        article.setTitle(articleDto.getTitle());
        article.setBlog(articleDto.getBlog());
        articleRepo.save(article);
        return ResponseEntity.ok("Success");
    }

    @Override
    public List<Article> getAllArticles() {
        return articleRepo.findAll();
    }

    @Override
    public Article getArticleById(Long id) throws NotFoundException {
        Article article = articleRepo.findById(id, Article.class);
        if (article == null) throw new NotFoundException("The article not found");
        return article;
    }


}
