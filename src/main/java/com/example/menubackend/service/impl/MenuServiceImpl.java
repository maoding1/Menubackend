package com.example.menubackend.service.impl;

import com.example.menubackend.Dao.MenuDao;
import com.example.menubackend.entity.MenuEntity;
import com.example.menubackend.entity.utils.Ingredient;
import com.example.menubackend.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.menubackend.entity.utils.RawMaterial;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {
    private final MenuDao menuDao;
    @Override
    public MenuEntity findMenuById(Long id) {
        Optional<MenuEntity> menuOptional = menuDao.findById(id);
        return menuOptional.orElse(null);
    }

    @Override
    public MenuEntity findMenuByName(String menuName) {
        Optional<MenuEntity> menuOptional = menuDao.findByMenuName(menuName);
        return menuOptional.orElse(null);
    }

    @Override
    public List<MenuEntity> getAll() {
        List<MenuEntity> allMenu = menuDao.findAll();
        return allMenu;
    }

    @Override
    public List<MenuEntity> findMenuByIngres(List<Ingredient> ingredients) {
        List<MenuEntity> menuList = menuDao.findAll(); // 假设获取所有菜单的方法为 menuDao.findAll()

        List<MenuEntity> filteredMenus = menuList.stream()
                .filter(menuContainsIngredients(ingredients))
                .toList();
        return filteredMenus;
    }

    public static Predicate<MenuEntity> menuContainsIngredients(List<Ingredient> ingredients) {
        return menu -> menu.getRawMaterials().stream()
                .map(RawMaterial::getIngredient)
                .anyMatch(ingredients::contains);
    }
}
