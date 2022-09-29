package com.del.shoppieapp.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetails {
	
	private Product product;
	
	private Coupon coupon;
	
	private float finalPrice;
	
	LocalDateTime time;
	
	

}
