package com.example.Portfolio.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "article_title")
    private String title;
    @Column(name = "article_blog")
    private String blog;
    //TODO ADD IMAGE
    public Article(String title, String blog) {
        this.title = title;
        this.blog = blog;
    }


}
