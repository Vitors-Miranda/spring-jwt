package com.jwt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.entity.ProductEntity;
import com.jwt.repository.ProductRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @PostMapping
    public ProductEntity saveProduct(@RequestBody ProductEntity product) {
        return productRepository.save(product);
    }

    @GetMapping
    public List<ProductEntity> getProducts() {
        return productRepository.findAll();
    }
    
    
}
