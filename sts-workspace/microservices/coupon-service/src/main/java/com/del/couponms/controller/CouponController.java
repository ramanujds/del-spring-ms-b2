package com.del.couponms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.del.couponms.model.Coupon;
import com.del.couponms.service.CouponService;

@RestController
@RequestMapping("/coupons")
public class CouponController {
	
	@Autowired
	CouponService service;

	@GetMapping("/{couponCode}")
	public Coupon getCoupon(@PathVariable String couponCode) {
		
		return service.getCoupon(couponCode);
	}
	
	
	@PostMapping
	public Coupon addCoupon(@RequestBody Coupon coupon) {
		return service.addCoupon(coupon);
	}
	
}
