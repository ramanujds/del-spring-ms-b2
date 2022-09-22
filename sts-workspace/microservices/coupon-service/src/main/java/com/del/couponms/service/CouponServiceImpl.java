package com.del.couponms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.del.couponms.model.Coupon;
import com.del.couponms.repository.CouponRepository;

@Service
public class CouponServiceImpl implements CouponService {

	@Autowired
	private CouponRepository repo;
	
	@Override
	public Coupon addCoupon(Coupon coupon) {
		return repo.save(coupon);
	}
	
	@Override
	public Coupon getCoupon(String couponCode) {
		// TODO Auto-generated method stub
		return repo.findById(couponCode).get();
	}
	
}
