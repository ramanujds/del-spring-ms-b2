package com.del.productms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.del.productms.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
