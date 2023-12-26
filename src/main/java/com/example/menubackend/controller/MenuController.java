package com.example.menubackend.controller;

import com.example.menubackend.entity.Category;
import com.example.menubackend.entity.MenuEntity;
import com.example.menubackend.entity.utils.Ingredient;
import com.example.menubackend.io.pojo.CommonResponse;
import com.example.menubackend.request.MenuRequest;
import com.example.menubackend.request.getMenuByIngredientRequest;
import com.example.menubackend.service.MenuService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
@RestController
@RequiredArgsConstructor
public class MenuController {
    private final MenuService menuService;

    private final Category category = new Category();

    @PostMapping("menu")
    public CommonResponse<MenuEntity> getMenuById(@Valid @RequestBody MenuRequest request) {
        CommonResponse<MenuEntity> commonResponse = CommonResponse.success(menuService.findMenuById(request.getId()));
        commonResponse.setCode(200);
        return commonResponse;
    }



    @GetMapping("menu")
    /* 排行榜 返回点击量前topk的菜谱*/
    public CommonResponse<List<MenuEntity>> getTop() {
        // Throws BizException if auth failed.
        int topk = 8;
        List<MenuEntity> menuEntityList = menuService.getAll();
        menuEntityList = menuEntityList.stream().sorted(Comparator.comparing(MenuEntity::getClickCount).
                reversed()).collect(Collectors.toList()).subList(0,topk);
        //
        //menuEntityList.forEach(System.out::println);
        //
        CommonResponse<List<MenuEntity>> commonResponse = CommonResponse.success(menuEntityList);
        commonResponse.setCode(200);

        return commonResponse;
    }

    @GetMapping("recommend")
    /*主页随机推荐*/
    public CommonResponse<List<MenuEntity>> getRecommend() {
        int topk = 8;
        Random random = new Random();
        List<MenuEntity> menuEntityList = menuService.getAll();
        int size = menuEntityList.size();
        List<MenuEntity> res = new ArrayList<>();
        for (int i=0; i < topk; i++){
            int randomIndex = random.nextInt(size - i);
            res.add(menuEntityList.get(randomIndex));
            int lastIndex = size - i - 1;
            MenuEntity lastMenu = menuEntityList.get(lastIndex);
            menuEntityList.set(randomIndex, lastMenu);
        }
        CommonResponse<List<MenuEntity>> response = CommonResponse.success(res);
        response.setCode(200);
        return response;
    }

    @PostMapping("getMenu")
    /* 根据原材料名称搜索 */
    public CommonResponse<List<MenuEntity>> getMenuByIngredient(@Valid @RequestBody getMenuByIngredientRequest request) {
        List<String> ingreNames = request.getIngreNames();
        List<Ingredient> ingredients = ingreNames.stream().map(Ingredient::new).toList();
        CommonResponse<List<MenuEntity>> response =CommonResponse.success(menuService.findMenuByIngres(ingredients));
        response.setCode(200);
        return response;
    }

    @GetMapping("ingredient")
    /* 返回所有原材料*/
    public CommonResponse<Category> getAllIngredients() {
        CommonResponse<Category> response = CommonResponse.success(category);
        response.setCode(200);
        return response;
    }


}
