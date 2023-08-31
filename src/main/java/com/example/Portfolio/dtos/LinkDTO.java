package com.example.Portfolio.dtos;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class LinkDTO {
    @NotNull(message = "The site name should not be null")
    @NotBlank(message = "The site name should not be blank")
    private String siteName;
    @NotNull(message = "The link url should not be null")
    @NotBlank(message = "The link url should not be blank")
    private String link;
}
