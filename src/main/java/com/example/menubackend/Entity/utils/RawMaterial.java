package com.example.menubackend.Entity.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RawMaterial {
    private Ingredient ingredient;

    private String amount;
}
