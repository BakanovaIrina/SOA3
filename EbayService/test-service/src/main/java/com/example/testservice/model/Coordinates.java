package com.example.testservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coordinates {

    @NotNull(message = "Координата X не может быть null")
    private Double x;

    @NotNull(message = "Координата Y не может быть null")
    @Max(value = 189, message = "Координата Y не может быть больше 189")
    private Float y;
}

