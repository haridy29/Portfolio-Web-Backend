package com.example.Portfolio.entities;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "address", nullable = false)
    private String address;

    @OneToMany(mappedBy = "owner",fetch = FetchType.LAZY)
    private Set<Link> links = new HashSet<>();

    @OneToMany(mappedBy = "owner",fetch = FetchType.LAZY)
    private Set<Project> projects = new HashSet<>();

    //TODO ADD IMAGE
    public Person(String name, String email, String phone, String address, Set<Link> links, Set<Project> projects) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.links = links;
        this.projects = projects;
    }
}
