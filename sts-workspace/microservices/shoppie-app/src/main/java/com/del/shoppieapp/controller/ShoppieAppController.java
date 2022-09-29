package com.del.shoppieapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.del.shoppieapp.model.OrderDetails;
import com.del.shoppieapp.service.ShoppieAppService;

@Controller
public class ShoppieAppController {
	
	@Autowired
	private ShoppieAppService service;
	
	@GetMapping("/find-order")
	public String findOrderDetails(@RequestParam("product-id") String productId,
				@RequestParam("coupon-code") String couponCode, Model m) {
		
		OrderDetails order = service.fetchOrderDetails(productId, couponCode);
		m.addAttribute("order", order);
		
		return "show-details.jsp";
		
	}

}
