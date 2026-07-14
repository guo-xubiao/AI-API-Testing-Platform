package com.example.orderflowdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.orderflowdemo.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{
    
}
