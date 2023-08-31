package com.example.Portfolio.repositories;

import com.example.Portfolio.entities.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfileRepo extends JpaRepository<Profile, Long> {
    <T> List<T> getAllBy(Class<T> type);

}
