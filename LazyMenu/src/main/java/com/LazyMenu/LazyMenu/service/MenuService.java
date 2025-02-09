package com.LazyMenu.LazyMenu.service;

import com.LazyMenu.LazyMenu.entity.Menu;
import com.LazyMenu.LazyMenu.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/*
Service เป็น Object ที่จะทำงาน Run time (ตลอดเวลา)
 */
@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;
    /*
    Autowired มันทำหน้าที่เป็น public MenuService แล้ว
        public MenuService(MenuRepository repo) {
        this.menuRepository = repo;
    }
     */

    public List<Menu> getAll() {
        return menuRepository.findAll(); // List<Menu>, Select All Object Menu
    }

    public Menu getMenuById(UUID id) {
        return menuRepository.findById(id).get();
    }

    public Menu createMenu(Menu menu) {
//        Menu record = menuRepository.save(menu);
        return menuRepository.save(menu);
    }

    /*
        Update จาก id
        รับ Object มาจาก requestBody
        ดึง ID แล้วทำการค้นหาด้วย ID จะได้ record
        นำค่าจาก requestBody set ทับลง record
        จากนั้นบันทึกไปยัง Data base
     */
    public Menu update(Menu requestBody) {
        UUID id = requestBody.getId();
        Menu record = menuRepository.findById(id).get();
        record.setName(requestBody.getName());
        record.setPrice(requestBody.getPrice());
        record.setCategory(requestBody.getCategory());

        record = menuRepository.save(record);
        return record;
    }

    public Menu delete(UUID id) {
        Menu record = menuRepository.findById(id).get();
        menuRepository.deleteById(id);
        return record;
    }

    // Search by name
    public Menu getMenuByName(String name) {
        return menuRepository.findByName(name);
    }

    // Search by Category
    public List<Menu> getMenuByCategory(String category) {
        return menuRepository.findByCategory(category);
    }
}
