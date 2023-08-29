package com.example.Portfolio.services;

import com.example.Portfolio.dtos.ProfileDTO;
import com.example.Portfolio.views.ProfileView;
import org.springframework.http.ResponseEntity;

import java.security.Principal;


public interface ProfileService {

    ResponseEntity<String> updateProfile(Principal principal, ProfileDTO profile);

    ProfileView getProfile();
}
