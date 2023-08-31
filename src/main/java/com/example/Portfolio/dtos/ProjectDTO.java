package com.example.Portfolio.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDTO {
    @NotNull(message = "Name should not be null")
    @NotBlank(message = "Name should not be blank")
    private String name;
    @NotNull(message = "Brief should not be null")
    @NotBlank(message = "Brief should not be blank")
    private String brief;
    @NotNull(message = "order should not be null")
    private Integer order;

}
