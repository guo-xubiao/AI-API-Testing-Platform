package com.example.orderflowdemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderflowdemo.common.ApiResponse;
import com.example.orderflowdemo.dto.CreateProductRequest;
import com.example.orderflowdemo.entity.Product;
import com.example.orderflowdemo.service.ProductService;

import jakarta.validation.Valid;

@RestController
public class ProductController {

    private final ProductService productService;
    
    public ProductController(ProductService productService){
        this.productService = productService;
    }


    @GetMapping("/api/products")
    public ApiResponse <List<Product>> getProducts(){
        return ApiResponse.success(productService.getProducts());
    }

    @GetMapping("/api/products/{id}")
    public ApiResponse <Product> getProductById(@PathVariable Long id){
        return ApiResponse.success(productService.getProductById(id));
    }

    @PostMapping("/api/products")
    public ApiResponse <Product> addProducts(@Valid @RequestBody CreateProductRequest request){
        return ApiResponse.success(productService.addProduct(request));
    }
    
}
