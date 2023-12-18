package com.example.menubackend.Dao;

import com.example.menubackend.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

}
