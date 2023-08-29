package com.example.Portfolio.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginDTO {
    @NotNull(message = "The username should not be Null")
    @NotBlank(message = "The username should not be empty")
    private String username;

    @NotNull(message = "The password should not be Null")
    @NotBlank(message = "The password should not be empty")
    @Length(min = 8, max = 32, message = "The password Length must be at least 8 characters")
    private String password;
}
