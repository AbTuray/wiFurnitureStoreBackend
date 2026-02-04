package com.raystech.wiFurnitureStoreBackend.repositories;

import com.raystech.wiFurnitureStoreBackend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
