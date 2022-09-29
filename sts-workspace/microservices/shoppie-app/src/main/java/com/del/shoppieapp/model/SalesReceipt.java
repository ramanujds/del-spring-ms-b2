package com.del.shoppieapp.model;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Data;

@Data
public class SalesReceipt {

	private String productId;
	private String productName;
	private float price;
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private LocalDateTime time;
	private float discount;
	private float finalPrice;
	private String couponCode;
	
}
