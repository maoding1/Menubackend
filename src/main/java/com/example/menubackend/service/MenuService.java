package com.example.menubackend.service;

import com.example.menubackend.entity.MenuEntity;
import com.example.menubackend.entity.utils.Ingredient;

import java.util.List;

public interface MenuService {
    MenuEntity findMenuById(Long id);

    MenuEntity findMenuByName(String menuName);

    List<MenuEntity> getAll();

    List<MenuEntity> findMenuByIngres(List<Ingredient> ingredients);
}
