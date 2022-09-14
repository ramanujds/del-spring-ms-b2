package com.del.empapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sim {

	@Value("${sim.phoneNo}")
	private long phoneNo;
	
	public void setPhoneNo(long phoneNo) {
		this.phoneNo=phoneNo;
	}
	
	public void call() {
		System.out.println("Making a call using "+phoneNo);
	}
	
	
}
