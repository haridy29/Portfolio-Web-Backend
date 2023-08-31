package com.example.Portfolio.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "link")
public class Link {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "site_name")
    private String siteName;

    @Column(name = "link")
    private String link;

    public Link(String siteName, String link) {
        this.siteName = siteName;
        this.link = link;
    }

    //TODO ADD IMAGE
}
