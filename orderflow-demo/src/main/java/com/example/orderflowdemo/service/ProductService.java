package com.example.orderflowdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.orderflowdemo.dto.CreateProductRequest;
import com.example.orderflowdemo.entity.Product;
import com.example.orderflowdemo.exception.BusinessException;
import com.example.orderflowdemo.mapper.ProductMapper;
import com.example.orderflowdemo.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long productId) {
        if (productId == null) {
            throw new BusinessException(406, "商品id不能为空");
        }

        return productRepository.findById(productId)
                .orElseThrow(() -> new BusinessException(402, "商品不存在"));
    }

    public Product addProduct(CreateProductRequest request) {
        Product product = productMapper.toEntity(request);
        if (product == null) {
            throw new BusinessException(405, "商品信息不能为空");
        }
        return productRepository.save(product);
    }
}
