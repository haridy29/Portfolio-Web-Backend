package com.example.Portfolio.repositories;

import com.example.Portfolio.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepo extends JpaRepository<Article, Long> {
    boolean existsByTitle(String title);
}
