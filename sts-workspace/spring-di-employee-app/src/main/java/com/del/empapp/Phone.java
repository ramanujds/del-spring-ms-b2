package com.del.empapp;

public class Phone {
	
	private Sim sim;
	
	private String brand;
	
	public void call() {
		sim.call();
	}
	
	public void showBand() {
		System.out.println("Brand : "+brand);
	}

}
