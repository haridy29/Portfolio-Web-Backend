package com.example.Portfolio.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "sections")
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "section_name", unique = true, nullable = false)
    private String SectionName;
    @Column(name = "section_blog", nullable = false)
    private String blog;
    @Column(name = "section_order", unique = true)
    private Integer order;

    public Section(String sectionName, String blog, Integer order) {
        SectionName = sectionName;
        this.blog = blog;
        this.order = order;
    }
}
