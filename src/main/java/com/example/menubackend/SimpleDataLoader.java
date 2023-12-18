package com.example.menubackend;

import com.example.menubackend.Dao.MenuDao;
import com.example.menubackend.Entity.Menu;
import com.example.menubackend.Entity.utils.Ingredient;
import com.example.menubackend.Entity.utils.RawMaterial;
import com.example.menubackend.Entity.utils.Step;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleDataLoader implements CommandLineRunner {
    private final MenuDao menuDao;

    @Autowired
    public SimpleDataLoader(MenuDao menuDao) {
        this.menuDao = menuDao;
    }
    @Override
    public void run(String... args) throws Exception {
        Menu exampleMenu = new Menu();
        List<Step> steps = new ArrayList<>();
        steps.add(new Step("description1", "imageurl1"));
        steps.add(new Step("description2", "imageurl2"));

        List<RawMaterial> rawMaterials = new ArrayList<>();
        rawMaterials.add(new RawMaterial(new Ingredient("ingredient1"), "1勺"));
        rawMaterials.add(new RawMaterial(new Ingredient("ingredient2"), "2杯"));

        exampleMenu.setMenuName("testName").setPreviewImgUrl("example.com").setClickCount(100).setSteps(steps).setRawMaterials(rawMaterials);

        menuDao.save(exampleMenu);
    }
}
