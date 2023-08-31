package com.example.Portfolio.services;

import com.example.Portfolio.dtos.ProfileDTO;
import com.example.Portfolio.views.ProfileView;
import org.springframework.http.ResponseEntity;


public interface ProfileService {

    ResponseEntity<String> updateProfile(ProfileDTO profile);

    ProfileView getProfile();
}
