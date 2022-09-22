package com.del.couponms.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Coupon {

	@Id
	private String couponCode;
	private float discount;
	private float minOderValue;
	
}
