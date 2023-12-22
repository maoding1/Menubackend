package com.example.menubackend.Dao;

import com.example.menubackend.entity.UserEntity;
import com.example.menubackend.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserEntity, Long> {
    UserEntity findByUid(String uid);
}
