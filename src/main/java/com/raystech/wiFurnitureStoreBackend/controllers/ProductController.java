package com.raystech.wiFurnitureStoreBackend.controllers;

import com.raystech.wiFurnitureStoreBackend.model.Product;
import com.raystech.wiFurnitureStoreBackend.services.ProductManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

    @Autowired
    private ProductManager productManager;

    @RequestMapping(value = "/get/products", method = RequestMethod.GET)
    public ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.ok(productManager.getAllProducts());
    }
}
