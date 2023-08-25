package com.example.Portfolio.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "articles")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "article_title")
    private String title;
    @Column(name = "article_blog")
    private String blog;

    public Article(String title, String blog) {
        this.title = title;
        this.blog = blog;
    }


}
