package com.example.Portfolio.entities;

import jakarta.persistence.*;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String blog;

    public Article(String title, String blog) {
        this.title = title;
        this.blog = blog;
    }

}
