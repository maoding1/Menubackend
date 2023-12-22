package com.example.menubackend.Dao;

import com.example.menubackend.entity.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MenuDao extends JpaRepository<MenuEntity, Long> {

    Optional<MenuEntity> findByMenuName(String menuName);
}
