package com.example.orderflowdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.orderflowdemo.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long>{
   
}
