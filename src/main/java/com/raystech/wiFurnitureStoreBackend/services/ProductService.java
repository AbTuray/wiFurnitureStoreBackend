package com.raystech.wiFurnitureStoreBackend.services;

import com.raystech.wiFurnitureStoreBackend.dto.ProductRequestDTO;
import com.raystech.wiFurnitureStoreBackend.dto.ProductResponseDTO;
import com.raystech.wiFurnitureStoreBackend.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<ProductResponseDTO> getAllProduct();

    ProductResponseDTO createProduct(ProductRequestDTO dto);
}
