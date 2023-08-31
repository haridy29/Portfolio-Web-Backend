package com.example.Portfolio.dtos;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ArticleDTO {
    @NotNull(message = "The title should not be null")
    @NotBlank(message = "The title should not be blank")
    private String title;

    @NotNull(message = "The blog should not be null")
    @NotBlank(message = "The blog should not be blank")
    private String blog;


}
