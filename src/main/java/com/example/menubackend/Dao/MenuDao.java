package com.example.menubackend.Dao;

import com.example.menubackend.entity.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuDao extends JpaRepository<MenuEntity, Long> {

}
