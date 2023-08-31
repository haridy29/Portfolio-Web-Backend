package com.example.Portfolio.services;

import com.example.Portfolio.dtos.ProjectDTO;
import com.example.Portfolio.entities.Project;
import com.example.Portfolio.exceptions.NotFoundException;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProjectService {
    ResponseEntity<String> addProject(ProjectDTO projectDTO);

    ResponseEntity<String> deleteProject(Long projectId);

    ResponseEntity<String> editProject(Long projectId, ProjectDTO projectDTO);

    List<Project> getAllArticles();

    Project getProjectById(Long projectId) throws NotFoundException;
}
