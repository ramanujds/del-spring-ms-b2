package com.del.productms.service;

import com.del.productms.model.Product;

public interface ProductService {

	public Product addProduct(Product product);
	
	public Product getProduct(String productId);
	
}
