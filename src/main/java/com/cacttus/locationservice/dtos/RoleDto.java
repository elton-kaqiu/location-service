package com.cacttus.locationservice.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class RoleDto {
    @Min(value = 0,message = "Minimal value is: 0")
    private int id;
    @NotBlank(message = "Not allowed blank value!")
    private String name;

    private String description;
}
