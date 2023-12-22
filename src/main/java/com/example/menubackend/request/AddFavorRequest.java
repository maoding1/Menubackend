package com.example.menubackend.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Schema(description = "添加收藏")
public class AddFavorRequest {

    @NotNull
    private Long menuId;
    @NotNull
    private String uid;
}
