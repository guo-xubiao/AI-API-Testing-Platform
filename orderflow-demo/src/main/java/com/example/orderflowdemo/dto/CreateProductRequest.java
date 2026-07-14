package com.example.orderflowdemo.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreateProductRequest {

    @NotBlank(message = "商品名称不能为空")
    private String name;

    @NotNull(message = "商品价格不能为空")
    @DecimalMin(value = "0.01", message = "商品价格必须大于0")
    private BigDecimal price;

    @NotNull(message = "库存数量不能为空")
    @Min(value = 0, message = "库存数量不能小于0")
    private Integer stock;

    private String description;
}
