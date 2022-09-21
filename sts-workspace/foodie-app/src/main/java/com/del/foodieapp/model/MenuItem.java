package com.del.foodieapp.model;


import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class MenuItem {

	@Id
	private long itemCode;
	private String itemName;
	@Enumerated
	private AvailabilityStatus status;
	private float price;
	@Enumerated
	private ItemCategory category;
	
}
