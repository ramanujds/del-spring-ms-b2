package com.del.empapp;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.del.empapp")
@PropertySource({"app.properties"})
public class AppConfig {

	/*
	<bean id="sim" class="com.del.empapp.Sim">
	<properties name="phoneNo" value="8877665544"/>
	</bean>
	*/
	
//	@Bean("sim")
//	public Sim getSimBean() {
//		Sim sim= new Sim();
//		sim.setPhoneNo(8877665544L);
//		return sim;
//	}
//	
//	
//	
//	@Bean("phone")
//	public Phone getPhoneBean() {
//		Phone phone = new Phone();
//		phone.setBrand("Apple");
////		phone.setSim(getSimBean());
//		return phone;
//	}
//	
//	@Bean("employee")
//	public Employee getEmployeeBean() {
//		Employee emp = new Employee();
//		emp.setEmpName("Suraj");
//		emp.setId(100101);
////		emp.setPhone(getPhoneBean());
//		emp.setSkills(Arrays.asList("Java","MySql","Spring Boot","Angular"));
//		return emp;
//	}
	
}
