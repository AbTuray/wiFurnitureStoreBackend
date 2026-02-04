package com.raystech.wiFurnitureStoreBackend.services;

import com.raystech.wiFurnitureStoreBackend.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<Product> getAllProducts();
}
