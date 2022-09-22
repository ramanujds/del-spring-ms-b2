package com.del.productms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.del.productms.model.Product;
import com.del.productms.repository.ProductRepository;
import com.del.productms.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping("/{productId}")
	public  Product getProduct(@PathVariable String productId) {
		return service.getProduct(productId);
	}
	
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return service.addProduct(product);
	}
	
	
}
