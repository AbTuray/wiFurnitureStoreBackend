package com.raystech.wiFurnitureStoreBackend.controllers;

import com.raystech.wiFurnitureStoreBackend.dto.ProductRequestDTO;
import com.raystech.wiFurnitureStoreBackend.dto.ProductResponseDTO;
import com.raystech.wiFurnitureStoreBackend.model.Product;
import com.raystech.wiFurnitureStoreBackend.services.ProductManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

    @Autowired
    private ProductManager productManager;

    @RequestMapping(value = "/get/products", method = RequestMethod.GET)
    public ResponseEntity<List<ProductResponseDTO>> getProducts() {
        return ResponseEntity.ok(productManager.getAllProduct());
    }

    @RequestMapping(value = "/create/product", method = RequestMethod.POST)
    public ResponseEntity<?> createProduct(@RequestBody ProductRequestDTO dto) {
        productManager.createProduct(dto);
        return ResponseEntity.ok().build();

        //return ResponseEntity.ok(productManager.createProduct(dto));
    }
}
