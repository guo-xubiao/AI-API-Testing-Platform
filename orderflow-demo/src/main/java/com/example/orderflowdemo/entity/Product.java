package com.example.orderflowdemo.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private BigDecimal price;
    private Integer stock;
    private String description;
    private int status;

    public Product(){}

    public Product(Long id, String name, BigDecimal price, Integer stock, String description, int status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.description = description;
        this.status = status;
    }

}
