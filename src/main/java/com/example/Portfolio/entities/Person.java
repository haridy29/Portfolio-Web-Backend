package com.example.Portfolio.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String Address;
    @OneToMany
    private List<Link> links;

    @OneToMany
    private List<Section> sections;
}
