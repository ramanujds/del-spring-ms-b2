package com.del.couponms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.del.couponms.model.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, String>{

}
