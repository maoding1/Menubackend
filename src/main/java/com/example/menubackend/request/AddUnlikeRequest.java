package com.example.menubackend.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Schema(description = "增加用户忌口")
public class AddUnlikeRequest {

    @NotNull
    @Schema(description = "账号", required = true)
    private  String uid;

    @NotNull
    @Schema(description = "忌口名称", required = true)
    private String ingredientName;
}
