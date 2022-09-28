package com.del.orderms.service;

import com.del.orderms.model.OrderDetails;
import com.del.orderms.model.Product;

public interface OrderService {

	public OrderDetails getOrderDetails(String productId, String couponCode) ;
	
	public Product addProduct(Product product);
	
}
