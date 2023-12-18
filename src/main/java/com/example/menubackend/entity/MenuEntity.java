package com.example.menubackend.entity;

import com.example.menubackend.entity.utils.RawMaterial;
import com.example.menubackend.entity.utils.Step;
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
public class MenuEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String previewImgUrl;

    private int clickCount;

    private List<RawMaterial> rawMaterials;

    private List<Step> steps;
}
