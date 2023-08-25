package com.example.Portfolio.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "")
public class Link {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String siteName;
    private String link;

}
