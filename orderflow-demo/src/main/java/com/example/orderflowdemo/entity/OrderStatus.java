package com.example.orderflowdemo.entity;

public enum OrderStatus {

    /**
     * 待支付
     */
    PENDING_PAYMENT(0, "待支付"),

    /**
     * 已支付
     */
    PAID(1, "已支付"),

    /**
     * 已取消
     */
    CANCELLED(2, "已取消"),

    /**
     * 已发货
     */
    SHIPPED(3, "已发货"),

    /**
     * 已完成
     */
    COMPLETED(4, "已完成"),

    /**
     * 已退款
     */
    REFUNDED(5, "已退款");

    private final Integer code;
    private final String description;

    OrderStatus(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
