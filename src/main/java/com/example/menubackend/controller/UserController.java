package com.example.menubackend.controller;

import com.example.menubackend.entity.UserEntity;
import com.example.menubackend.dao.UserDao;
import com.example.menubackend.io.pojo.CommonResponse;
import com.example.menubackend.request.AddUnlikeRequest;
import com.example.menubackend.request.LoginRequest;
import com.example.menubackend.request.RegisterRequest;
import com.example.menubackend.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
@RestController
@RequestMapping("/v1/")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final UserDao userDao;

    @GetMapping("user")
    public CommonResponse<UserEntity> login(@Valid @RequestBody LoginRequest request) {
        // Throws BizException if auth failed.
        boolean loginResult = userService.login(request.getUid(), request.getPassword());

        if (!loginResult)
            return CommonResponse.fail(400);
        else
        {
            UserEntity userEntity = userDao.findByUid(request.getUid());
            CommonResponse<UserEntity> commonResponse = CommonResponse.success(userEntity);
            commonResponse.setCode(200);
            return commonResponse;
        }
    }

    @PostMapping("user")
    public CommonResponse<UserEntity> register(@Valid @RequestBody RegisterRequest request) {
        // Throws BizException if register failed.
        boolean registerResult = userService.register(request.getUid(), request.getPassword());


        if (!registerResult)
            return CommonResponse.fail(400);
        else
        {
            UserEntity userEntity = userDao.findByUid(request.getUid());
            CommonResponse<UserEntity> commonResponse = CommonResponse.success(userEntity);
            commonResponse.setCode(200);
            return commonResponse;
        }
    }

    @DeleteMapping("session")
    public CommonResponse<?> logout() {
        return CommonResponse.success(200);
    }

    @PostMapping("addUnlike")
    public CommonResponse<?> addUnlike(@Valid @RequestBody AddUnlikeRequest request){
        boolean result = userService.addUnlike(request.getUid(), request.getIngredientName());
        if (!result)
            return CommonResponse.fail(400);
        else {
            return CommonResponse.success(200);
        }
    }
}