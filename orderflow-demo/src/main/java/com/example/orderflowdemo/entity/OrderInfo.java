package com.example.orderflowdemo.entity;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;

@Data
@Entity
public class OrderInfo {
    @Id
    private Long id;
    private Long userId;
    private BigDecimal totalAmount;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;
    private LocalDateTime payTime;
    private LocalDateTime shippingTime;
    private LocalDateTime completionTime;

    public OrderInfo(){}

    public OrderInfo(Long id, Long userId, BigDecimal totalAmount, OrderStatus status, LocalDateTime createdTime,
        LocalDateTime updatedTime,LocalDateTime payTime,LocalDateTime shippingTime,LocalDateTime completionTime) {
        this.id = id;
        this.userId = userId;
        this.totalAmount = totalAmount;
        this.status = status;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.payTime = payTime;
        this.shippingTime = shippingTime;
        this.completionTime = completionTime;
    }
}

    