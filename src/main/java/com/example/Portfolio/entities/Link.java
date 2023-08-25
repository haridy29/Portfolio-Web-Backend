package com.example.Portfolio.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "links")
public class Link {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "site_name")
    private String siteName;
    @Column(name = "link")
    private String link;

}
