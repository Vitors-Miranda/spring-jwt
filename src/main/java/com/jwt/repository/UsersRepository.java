package com.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.entity.ProductEntity;

public interface UsersRepository extends JpaRepository <ProductEntity, Integer> {
    
}
