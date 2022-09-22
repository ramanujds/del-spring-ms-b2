package com.del.couponms.service;

import com.del.couponms.model.Coupon;

public interface CouponService {

	public Coupon addCoupon(Coupon coupon);
	public Coupon getCoupon(String couponCode);
	
}
