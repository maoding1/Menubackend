package com.example.menubackend.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Schema(description = "登录请求")
public class LoginRequest {

    @Schema(description = "账号", required = true)
    @NotNull
    @Min(value = 4, message = "账号长度必须大于等于 4")
    @Max(value = 16, message = "账号长度必须小于等于 16")
    private Long uid;

    @Schema(description = "密码", required = true)
    @NotNull
    @Size(min = 8, max = 56, message = "密码长度必须在 8-56 之间")
    @Pattern.List({
            @Pattern(regexp = "^[\\x21-\\x7e]*$", message = "密码只能包含字母,数字和符号"),
            @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$", message = "密码未达到复杂性要求:密码必须包含大小写字母和数字")
    })
    private String password;
}
