package com.example.Portfolio.repositories;

import com.example.Portfolio.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends JpaRepository<Project, Long> {
    <T> T findByOrderOrName(Integer order, String name);
    <T> boolean existsByOrder(Integer order);
    <T> T findById(Long id, Class<T> type);
}
