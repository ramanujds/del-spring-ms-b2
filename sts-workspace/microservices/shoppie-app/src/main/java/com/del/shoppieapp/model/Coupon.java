package com.del.shoppieapp.model;



import lombok.Data;

@Data
public class Coupon {


	private String couponCode;
	private float discount;
	private float minOderValue;
	
}
