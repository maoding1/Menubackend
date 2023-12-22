package com.example.menubackend;

import com.example.menubackend.Dao.MenuDao;
import com.example.menubackend.entity.MenuEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class MenubackendApplication {

	private static MenuDao menuDao = null;

	public MenubackendApplication(MenuDao menuDao) {
		this.menuDao = menuDao;
	}

	public static void main(String[] args) {
		SpringApplication.run(MenubackendApplication.class, args);
//		ObjectMapper objectMapper = new ObjectMapper();
//		try {
//			// 读取JSON文件
//			File file = new File("C:\\Users\\13584\\Desktop\\2023_Fall\\人机交互\\crawlerOfMenu\\menus.json");
//
//			// 解析JSON数据
//			List<MenuEntity> menus = objectMapper.readValue(file, new TypeReference<List<MenuEntity>>() {});
//
//			Random random = new Random();
//			// 将解析后的数据存储到数据库中
//			for (MenuEntity menu : menus) {
//				menu.setClickCount(random.nextInt(200));
//				menuDao.save(menu);
////				System.out.println(menu);
//			}
//
//			System.out.println("Menus saved to the database successfully.");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

}
