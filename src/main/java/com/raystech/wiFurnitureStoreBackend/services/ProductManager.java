package com.raystech.wiFurnitureStoreBackend.services;

import com.raystech.wiFurnitureStoreBackend.model.Product;
import com.raystech.wiFurnitureStoreBackend.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
