package com.example.menubackend.Dao;

import com.example.menubackend.Entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuDao extends JpaRepository<Menu, Long> {

}
