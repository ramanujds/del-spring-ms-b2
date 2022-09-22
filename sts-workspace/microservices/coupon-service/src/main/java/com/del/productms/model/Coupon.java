package com.del.productms.model;

import lombok.Data;

@Data
public class Coupon {

	private String couponCode;
	private float discount;
	private float minOderValue;
	
}
