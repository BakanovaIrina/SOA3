package com.example.testservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @NotNull(message = "ID не может быть null")
    @Min(value = 1, message = "ID должен быть больше 0")
    private Integer id;

    @NotBlank(message = "Имя не может быть пустым")
    private String name;

    @NotNull(message = "Координаты не могут быть null")
    private Coordinates coordinates;

    @NotNull(message = "Дата создания не может быть null")
    private LocalDateTime creationDate = LocalDateTime.now(); // Генерируется автоматически

    @Min(value = 1, message = "Цена должна быть больше 0")
    private double price;

    private int manufactureCost;

    private UnitOfMeasure unitOfMeasure;

    @NotNull(message = "Владелец не может быть null")
    private Person owner;
}

