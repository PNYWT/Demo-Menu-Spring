package com.LazyMenu.LazyMenu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Menu {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private double price;
    private String category;
}
