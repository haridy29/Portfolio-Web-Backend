package com.example.Portfolio.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "project_name", unique = true, nullable = false)
    private String name;
    @Column(name = "project_brief", nullable = false)
    private String brief;
    @Column(name = "projectx_order", unique = true)
    private Integer order;

    public Project(String name, String brief, Integer order) {
        this.name = name;
        this.brief = brief;
        this.order = order;
    }

    //TODO ADD IMAGE
}
