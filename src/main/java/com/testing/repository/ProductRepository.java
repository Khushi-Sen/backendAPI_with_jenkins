package com.testing.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.testing.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
    // MongoRepository provides CRUD by default
}


