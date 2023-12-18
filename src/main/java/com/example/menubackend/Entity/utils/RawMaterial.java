package com.example.menubackend.Entity.utils;

import jakarta.persistence.Embeddable;
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
