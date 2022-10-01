package com.ecom.sysproduct.repository;

import com.ecom.sysproduct.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
