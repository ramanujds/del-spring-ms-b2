package com.del.empapp;

public class Phone {
	
	private Sim sim;
	
	private String brand;
	
	
	
	public void setSim(Sim sim) {
		this.sim = sim;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void call() {
		sim.call();
	}
	
	public void showBrand() {
		System.out.println("Brand : "+brand);
	}

}
