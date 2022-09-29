package com.del.shoppieapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.del.shoppieapp.model.OrderDetails;
import com.del.shoppieapp.model.SalesReceipt;
import com.del.shoppieapp.service.ShoppieAppService;

@Controller
@Scope("session")
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
	
	@PostMapping("/save-recipt")
	public String saveReceipt(@ModelAttribute SalesReceipt receipt) {
		System.out.println(receipt);
		return "search-order.jsp";
	}

}
