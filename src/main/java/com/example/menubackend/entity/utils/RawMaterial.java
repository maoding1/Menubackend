package com.example.menubackend.entity.utils;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class RawMaterial {
    private Ingredient ingredient;

    private String amount;
}
