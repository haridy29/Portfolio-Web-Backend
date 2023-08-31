package com.example.Portfolio.repositories;

import com.example.Portfolio.entities.Link;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepo extends JpaRepository<Link, Long> {
    <T> T findById(Long id, Class<T> type);
}
