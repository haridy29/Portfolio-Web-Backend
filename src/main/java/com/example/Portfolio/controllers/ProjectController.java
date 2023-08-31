package com.example.Portfolio.controllers;

import com.example.Portfolio.entities.Project;
import com.example.Portfolio.exceptions.NotFoundException;
import com.example.Portfolio.services.ProjectService;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService projectService;

    @GetMapping("/projects")
    public List<Project> getAllProjects() {
        return projectService.getAllArticles();
    }

    @GetMapping("projects/{id}")
    public Project getProject(@NotNull @PathVariable("id") Long projectId) throws NotFoundException {
        return projectService.getProjectById(projectId);
    }
}
