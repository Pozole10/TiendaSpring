package com.utxj.productstoreapi.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utxj.productstoreapi.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
    
}
