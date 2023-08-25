package com.example.Portfolio.entities;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;
    @OneToMany
    private List<Link> links;

    @OneToMany
    private List<Section> sections;

    public Person(String name, String email, String phone, String address, List<Link> links, List<Section> sections) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.links = links;
        this.sections = sections;
    }
}
