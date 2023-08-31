package com.example.Portfolio.controllers;

import com.example.Portfolio.dtos.LoginDTO;
import com.example.Portfolio.services.AuthenticationService;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
@RequiredArgsConstructor
public class HomeController {
    private final AuthenticationService service;

    @PostMapping("/login")
    public void login(HttpServletResponse response, @Valid @RequestBody LoginDTO loginDTO) {
        service.login(response, loginDTO);
    }

}
