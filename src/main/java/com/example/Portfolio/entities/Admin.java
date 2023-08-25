package com.example.Portfolio.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "admins")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "roles")
    private String roles = "ADMIN";
    @Column(name = "permissions")
    private String permissions = "";

    public List<String> getRoles() {
        if (!roles.isEmpty()) {
            return Arrays.asList(this.roles.split(","));
        }
        return new ArrayList<>();
    }

    public List<String> getPermissions() {
        if (!this.permissions.isEmpty()) {
            return Arrays.asList(this.permissions.split(","));
        }
        return new ArrayList<>();
    }
}
