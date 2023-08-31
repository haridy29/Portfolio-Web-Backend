package com.example.Portfolio.services;

import com.example.Portfolio.dtos.ProfileDTO;
import com.example.Portfolio.entities.Profile;
import com.example.Portfolio.repositories.AdminRepo;
import com.example.Portfolio.repositories.ProfileRepo;
import com.example.Portfolio.views.ProfileView;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService {
    private final ProfileRepo profileRepo;
    private final AdminRepo adminRepo;


    @Override
    public ResponseEntity<String> updateProfile(ProfileDTO profile) {
        List<Profile> profiles = profileRepo.findAll();
        Profile myProfile;
        if (profiles.isEmpty()) {
            myProfile = new Profile(profile.getFirstName(), profile.getLastName(), profile.getEmail(), profile.getPhone(), profile.getAddress());

        } else {
            myProfile = profiles.get(0);
            myProfile.setFirstName(profile.getFirstName());
            myProfile.setFirstName(profile.getLastName());
            myProfile.setEmail(profile.getEmail());
            myProfile.setAddress(profile.getAddress());
            myProfile.setPhone(profile.getPhone());
        }
        profileRepo.save(myProfile);
        return ResponseEntity.ok("Success");
    }

    @Override
    public ProfileView getProfile() {
        List<ProfileView> profileViews = profileRepo.getAllBy(ProfileView.class);
        if (profileViews.isEmpty()) {
            throw new NoSuchElementException("No profile exists");
        }
        return profileViews.get(0);
    }
}
