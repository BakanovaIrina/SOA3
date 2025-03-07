package com.example.testservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @NotNull(message = "ID не может быть null")
    @Min(value = 1, message = "ID должен быть больше 0")
    private Integer id;

    @NotBlank(message = "Имя не может быть пустым")
    private String name;

    private ZonedDateTime birthday; // Может быть null

    @Min(value = 1, message = "Рост должен быть больше 0")
    private long height;

    @Min(value = 1, message = "Вес должен быть больше 0")
    private long weight;

    private Location location; // Может быть null
}

