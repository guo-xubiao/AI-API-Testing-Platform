package com.example.orderflowdemo.entity;

import java.math.BigDecimal;

public class OrderItem {
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

    public Long getId() {
        return id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public BigDecimal getSubtotalAmount() {
        return subtotalAmount;
    }
    public OrderStatus status() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setSubtotalAmount(BigDecimal subtotalAmount) {
        this.subtotalAmount = subtotalAmount;
    }
    public void setOrderStatus(OrderStatus status) {
        this.status = status;
    }
}
