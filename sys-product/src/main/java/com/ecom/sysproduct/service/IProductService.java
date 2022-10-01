package com.ecom.sysproduct.service;

import com.ecom.sysproduct.dto.ProductRequest;
import com.ecom.sysproduct.dto.ProductResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProductService {
    void createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();
}
