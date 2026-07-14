package com.example.orderflowdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.orderflowdemo.entity.OrderInfo;

public interface OrderInfoRepository extends JpaRepository<OrderInfo,Long>{
    
}
