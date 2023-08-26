package com.example.Portfolio.services;

import com.example.Portfolio.dtos.LoginDTO;
import com.example.Portfolio.repositories.AdminRepo;
import com.example.Portfolio.security.JwtService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final JwtService jwtService;
    private final AuthenticationManager authManager;
    private final AdminRepo adminRepo;

    public void login(HttpServletResponse response, LoginDTO loginDTO) {
        authManager.authenticate(new UsernamePasswordAuthenticationToken(loginDTO.getUsername(), loginDTO.getPassword()));

        var user = adminRepo.findAdminByUsername(loginDTO.getUsername())
                .orElseThrow();

        var jwtToken = jwtService.generateToken(user);
        response.addHeader("Authorization", jwtToken);
    }
}
