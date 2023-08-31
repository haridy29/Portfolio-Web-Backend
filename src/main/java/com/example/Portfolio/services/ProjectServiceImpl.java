package com.example.Portfolio.services;

import com.example.Portfolio.dtos.ArticleDTO;
import com.example.Portfolio.dtos.ProjectDTO;
import com.example.Portfolio.entities.Project;
import com.example.Portfolio.repositories.ProjectRepo;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepo projectRepo;

    @Override
    public ResponseEntity<String> addProject(ProjectDTO projectDTO) {
        Project project = projectRepo.findByOrderOrName(projectDTO.getOrder(), projectDTO.getName());
        if (project != null) {
            if (projectDTO.getName().equals(project.getName()))
                return ResponseEntity.badRequest().body("The name Already used");
            else
                return ResponseEntity.badRequest().body("The order Already used");
        }
        project = new Project(projectDTO.getName(), projectDTO.getBrief(), projectDTO.getOrder());
        projectRepo.save(project);
        return ResponseEntity.ok("Success");
    }

    @Override
    public ResponseEntity<String> deleteProject(Long projectId) {
        Project project = projectRepo.findById(projectId, Project.class);
        if (project == null) {
            return ResponseEntity.badRequest().body("The project not exist");
        }
        projectRepo.deleteById(projectId);
        return ResponseEntity.ok("Success");
    }

    private boolean canUpdateOrder(Project project, Integer order) {
        return order.equals(project.getOrder()) || !projectRepo.existsByOrder(order);

    }

    @Override
    public ResponseEntity<String> editProject(Long projectId, ProjectDTO projectDTO) {
        Project project = projectRepo.findById(projectId, Project.class);
        if (project == null) {
            return ResponseEntity.badRequest().body("The project not exist");
        }
        project.setName(projectDTO.getName());
        project.setBrief(projectDTO.getBrief());
        if (!canUpdateOrder(project, projectDTO.getOrder()))
            return ResponseEntity.badRequest().body("The order Already used");
        project.setOrder(projectDTO.getOrder());
        projectRepo.save(project);
        return ResponseEntity.ok("Success");
    }

}
