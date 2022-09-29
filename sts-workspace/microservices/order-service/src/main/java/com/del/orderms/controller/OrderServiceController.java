package com.del.orderms.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.del.orderms.model.Coupon;
import com.del.orderms.model.OrderDetails;
import com.del.orderms.model.Product;
import com.del.orderms.service.OrderService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/orders")
public class OrderServiceController {

	@Autowired
	private OrderService service;

	@GetMapping("/product/{productId}/coupon/{couponCode}")
	@CircuitBreaker(name = "order-service-cb", fallbackMethod = "getOrderDetailsFallback" )
	public OrderDetails getOrderDetails(@PathVariable String productId, 
					@PathVariable String couponCode) {
		
		return service.getOrderDetails(productId, couponCode);
		
	}

	public OrderDetails getOrderDetailsFallback(@PathVariable String productId, @PathVariable String couponCode,
			Exception ex) {

		Product p1 = new Product();
		Coupon c1= new Coupon();
		p1.setPrice(100);
		p1.setProductId(productId);
		p1.setProductName("Dummy Product");
		c1.setCouponCode(couponCode);
		c1.setDiscount(1);
		c1.setMinOderValue(1);
		System.err.println(ex);
		LocalDateTime time = LocalDateTime.now();
		return new OrderDetails(p1, c1, 0,time);

	}
}
