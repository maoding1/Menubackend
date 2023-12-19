package com.example.menubackend.entity.utils;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Step {
    @Column(length = 1000)
    private String description;
    @Column(length = 1000)
    private String imageUrl;
}
