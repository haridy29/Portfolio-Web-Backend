package com.example.Portfolio.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProfileDTO {

    @NotNull(message = "The first name should not be null")
    @NotBlank(message = "The first name should not be empty")
    private String firstName;

    @NotNull(message = "The last name should not be null")
    @NotBlank(message = "The last name should not be empty")
    private String lastName;

    @NotNull(message = "The email should not be null")
    @NotBlank(message = "The email should not be empty")
    private String email;

    @NotNull(message = "The phone should not be null")
    @NotBlank(message = "The phone should not be empty")
    private String phone;

    @NotNull(message = "The address should not be null")
    @NotBlank(message = "The address should not be empty")
    private String address;

}
