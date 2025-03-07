package com.example.testservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    @NotNull(message = "Координата X не может быть null")
    private Double x;

    @NotNull(message = "Координата Y не может быть null")
    private Double y;

    @NotBlank(message = "Название не может быть пустым")
    @Size(max = 940, message = "Название не может быть длиннее 940 символов")
    private String name;
}

