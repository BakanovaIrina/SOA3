package com.soa.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewProduct {

    @NotBlank(message = "Имя не может быть пустым")
    private String name;

    @NotNull(message = "Координаты не могут быть null")
    private Coordinates coordinates;

    @Min(value = 1, message = "Цена должна быть больше 0")
    private double price;

    private int manufactureCost;

    private UnitOfMeasure unitOfMeasure;

    @NotNull(message = "Владелец не может быть null")
    private Person owner;
}
