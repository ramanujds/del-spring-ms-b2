package com.del.orderms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.del.orderms.model.OrderDetails;
import com.del.orderms.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderServiceController {
	
	@Autowired
	private OrderService service;

	@GetMapping("/product/{productId}/coupon/{couponCode}")
	public OrderDetails getOrderDetails(@PathVariable String productId, 
					@PathVariable String couponCode) {
		
		return service.getOrderDetails(productId, couponCode);
		
	}
	
}
