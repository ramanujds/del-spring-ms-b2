package com.del.app;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapsExample {

	public static void main(String[] args) {
		// Set<Person> personList = new HashSet<>();
		
		Person p1 = new Person("Rohit", 25, "rohit@yahoo.com",45600);
		Person p2 = new Person("Shreya", 23, "shreya@yahoo.com",38200);
		Person p3 = new Person("Manoj", 24, "manoj@yahoo.com",36500);
		Person p4 = new Person("Priya", 25, "priya@yahoo.com",45300);
		Person p5 = new Person("Javed", 28, "javed@yahoo.com",62800);
		
		Map<String, Person> personList = new HashMap<>();
		
		personList.put(p1.getPersonName(), p1);
		personList.put(p2.getPersonName(), p2);
		personList.put(p3.getPersonName(), p3);
		personList.put(p4.getPersonName(), p4);
		personList.put(p5.getPersonName(), p5);
		
		String input = "Priya";
		
		Person searchedPerson = personList.get(input);
		
		
//		personList.add(p1);
//		personList.add(p2);
//		personList.add(p3);
//		personList.add(p4);
//		personList.add(p5);
//	
//		
//		String input = "Priya";
//		
//		Person searchedPerson = null;
//		for(Person p:personList) {
//			if(p.getPersonName().equals(input)) {
//				searchedPerson = p;
//			}
//		}
//		
		System.out.println(searchedPerson);
		
		
		
		
	}
	
}
