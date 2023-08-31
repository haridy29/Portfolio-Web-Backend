package com.example.Portfolio.services;

import com.example.Portfolio.entities.Admin;
import com.example.Portfolio.repositories.AdminRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {
    private final AdminRepo adminRepo;

    @Override
    public Admin getAdminByUsername(String username) {
        return adminRepo.findAdminByUsername(username).orElseThrow();
    }
}
