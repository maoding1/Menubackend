package com.example.menubackend.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "根据原材料查询菜谱")
public class getMenuByIngredientRequest {
    @NotNull
    List<String> ingreNames;
}
