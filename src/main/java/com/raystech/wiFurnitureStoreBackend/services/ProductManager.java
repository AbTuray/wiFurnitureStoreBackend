package com.raystech.wiFurnitureStoreBackend.services;

import com.raystech.wiFurnitureStoreBackend.dto.ProductRequestDTO;
import com.raystech.wiFurnitureStoreBackend.dto.ProductResponseDTO;
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
    public List<ProductResponseDTO> getAllProduct() {
        return productRepository.findAll().stream().map(this::mapToResponseDTO).toList();
    }

    private ProductResponseDTO mapToResponseDTO(Product product) {
        return new ProductResponseDTO(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice()
        );
    }

    @Override
    public ProductResponseDTO createProduct(ProductRequestDTO dto) {
        Product product = mapToEntity(dto);
        Product saveProduct = productRepository.save(product);
        return mapToResponseDTO(saveProduct);
    }

    private Product mapToEntity(ProductRequestDTO dto){
        Product newProduct = new Product();
        newProduct.setName(dto.getName());
        newProduct.setDescription(dto.getDescription());
        newProduct.setPrice(dto.getPrice());
        return newProduct;
    }

}
