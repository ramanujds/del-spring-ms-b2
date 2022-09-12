package com.del.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonOperation {

	public static void main(String[] args) {
		
		List<Person> personList = new ArrayList<>();
		
		Person p1 = new Person("Rohit", 25, "rohit@yahoo.com",45600);
		Person p2 = new Person("Shreya", 23, "shreya@yahoo.com",38200);
		Person p3 = new Person("Manoj", 24, "manoj@yahoo.com",36500);
		Person p4 = new Person("Priya", 25, "priya@yahoo.com",45300);
		Person p5 = new Person("Javed", 28, "javed@yahoo.com",62800);
		
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		personList.add(p5);
		
	//	List<Person> pList = Arrays.asList(p1,p2,p3,p4,p5);
		
//		for(Person p : personList) {
//			System.out.println(p);
//		}
		
//		personList.forEach(p -> System.out.println(p));

		
		// Streams Stream API
		
		Stream<Person> stream = personList.stream();
		
		// filter
		// map
		// reduce
		// collect
		// count
		
		List<Person> seniorPersons = stream.filter(p->p.getAge()>24)
											.collect(Collectors.toList());
		
//		for(Person p:personList) {
//			if(p.getAge()>24) {
//				seniorPersons.add(p);
//			}
//		}
		
		for(Person p:seniorPersons) {
			System.out.println(p);
		}
		
		// Increment the salary by 15% for the Persons having age>24
		
		// Sort Persons by name
		// Sort persons by salary
		// Find the person with max salary
		// Find the senior most person
		
	}

}
