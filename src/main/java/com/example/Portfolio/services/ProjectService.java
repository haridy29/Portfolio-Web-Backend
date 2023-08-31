package com.example.Portfolio.services;

import com.example.Portfolio.dtos.ArticleDTO;
import com.example.Portfolio.dtos.ProjectDTO;
import org.springframework.http.ResponseEntity;

public interface ProjectService {
    ResponseEntity<String> addProject(ProjectDTO projectDTO);

    ResponseEntity<String> deleteProject(Long projectId);

    ResponseEntity<String> editProject(Long projectId, ProjectDTO projectDTO);
}
