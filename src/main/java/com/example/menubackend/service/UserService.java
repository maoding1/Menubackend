package com.example.menubackend.service;

import com.example.menubackend.entity.UserEntity;

public interface UserService {
    boolean login(String uid, String password);
    boolean register(String uid, String password);

    UserEntity findByUid(String uid);
    void editInfo(String uid,String username);

    boolean addUnlike(String uid, String ingredientName);
}