package com.del.orderms.service;

import com.del.orderms.model.OrderDetails;

public interface OrderService {

	public OrderDetails getOrderDetails(String productId, String couponCode) ;
	
}
