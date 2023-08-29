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

    @ManyToOne(fetch = FetchType.LAZY)
    private Profile profile;

    //TODO ADD IMAGE
}
