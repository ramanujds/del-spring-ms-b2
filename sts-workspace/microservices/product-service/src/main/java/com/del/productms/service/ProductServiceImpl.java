package com.del.productms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.del.productms.model.Product;
import com.del.productms.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository repo;

	@Override
	public Product addProduct(Product product) {
		return repo.save(product);
	}

	@Override
	public Product getProduct(String productId) {
		return repo.findById(productId).get();
	}

}
