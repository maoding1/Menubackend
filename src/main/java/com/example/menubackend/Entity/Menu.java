package com.example.menubackend.Entity;

import com.example.menubackend.Entity.utils.RawMaterial;
import com.example.menubackend.Entity.utils.Step;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String previewImgUrl;

    private int clickCount;

    @ElementCollection
    private List<RawMaterial> rawMaterials;

    @ElementCollection
    private List<Step> steps;
}
