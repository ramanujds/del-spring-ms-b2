package com.del.empapp;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Phone implements InitializingBean, DisposableBean{
	
	@Autowired
	private Sim sim;
	
	@Value("${phone.brand}")
	private String brand;
	
	public Phone() {
		System.out.println("Phone Object Created");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(brand);	
	}
	
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
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Phone Bean destroyed");
	}

}
