package com.LazyMenu.LazyMenu.controller;

import com.LazyMenu.LazyMenu.entity.Menu;
import com.LazyMenu.LazyMenu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/*
    สร้าง Get, Post ที่นี่
 */
@RestController
public class MenuController {

    @Autowired
    private MenuService service;

    /*
        ดึง Object แล้วแปลงเป็น JSON ส่งออกไป
     */
    @GetMapping("/menu")
    public List<Menu> getAll() {
        return service.getAll();
    }

    @GetMapping("/menu/{id}")
    public Menu getMenuById(@PathVariable("id") UUID id) {
        return service.getMenuById(id);
    }

    /*
        รับ Body Request แล้วแปลงเป็น Object ส่งไป Save
    */
    @PostMapping("/menu")
    public Menu createMenu(@RequestBody Menu menu) {
        return service.createMenu(menu);
    }

    /*
       รับ Body Request แล้วแปลงเป็น Object ส่งไป Update
    */
    @PutMapping("/menu")
    public Menu update(@RequestBody Menu menu) {
        return service.update(menu);
    }

    /*
       รับ Body Request แล้วแปลงเป็น Object ส่งไป Delete
    */
    @DeleteMapping("/menu/{id}")
    public Menu delete(@PathVariable UUID id) {
        return service.delete(id);
    }

    @GetMapping("/menu/name/{name}")
    public Menu getMenuByName(@PathVariable String name) {
        return service.getMenuByName(name);
    }

    @GetMapping("/menu/category/{category}")
    public List<Menu> getMenuByCategory(@PathVariable String category) {
        return service.getMenuByCategory(category);
    }

}
