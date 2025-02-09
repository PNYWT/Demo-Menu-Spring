package com.LazyMenu.LazyMenu.repository;

import com.LazyMenu.LazyMenu.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

/*
สร้าง MenuRepository เป็น Subclass ของ JpaRepository
JpaRepository จะเจาะคงไปที่การจัดการกับ Database
JpaRepository มี Update, Select, Delete และเราสามารถเพิ่ม Custom qurry เองได้
 */
@Repository
public interface MenuRepository extends JpaRepository<Menu, UUID> {
    Menu findByName(String name);
    List<Menu> findByCategory(String category);
}

