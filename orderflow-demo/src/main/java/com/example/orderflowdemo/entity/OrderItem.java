package com.example.orderflowdemo.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class OrderItem {
    @Id 
    private Long id;
    private Long orderId;
    private Long productId;
    private String productName;
    private BigDecimal unitPrice;
    private int quantity;
    private BigDecimal subtotalAmount;
    private OrderStatus status;

    public OrderItem() {

    }

    public OrderItem(Long id, Long orderId, Long productId, String productName,
            BigDecimal unitPrice, Integer quantity, BigDecimal subtotalAmount,OrderStatus status) {
        this.id = id;
        this.orderId = orderId;
        this.productId = productId;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.subtotalAmount = subtotalAmount;
        this.status = status;
    }
}
