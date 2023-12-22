package com.example.menubackend.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Schema(description = "根据id获取menu信息")
public class MenuRequest {
    @NotNull
    @Schema(description = "想要获取的menu id", required = true)
    private Long id;
}
