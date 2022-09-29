package com.del.shoppieapp.service;

import com.del.shoppieapp.model.OrderDetails;

public interface ShoppieAppService {

	public OrderDetails fetchOrderDetails(String productId, String couponCode);
	
}
