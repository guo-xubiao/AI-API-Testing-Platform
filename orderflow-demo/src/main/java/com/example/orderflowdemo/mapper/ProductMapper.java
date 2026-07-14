package com.example.orderflowdemo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.orderflowdemo.dto.CreateProductRequest;
import com.example.orderflowdemo.entity.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "status", constant = "1")
    Product toEntity(CreateProductRequest request);
}
