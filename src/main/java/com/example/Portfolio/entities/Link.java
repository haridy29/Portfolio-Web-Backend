package com.example.Portfolio.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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
    private Person owner;

    //TODO ADD IMAGE
}
