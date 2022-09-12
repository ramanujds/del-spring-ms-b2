package com.del.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class SortingCollectionExample {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10,20,4,6,9,1,8);
		Comparator<Integer> revSort = (n1,n2)->n2-n1;
		Collections.sort(numbers,revSort);
		
		System.out.println(numbers);
		
		Comparator<String> sortReverse = (s1,s2)->s2.compareTo(s1);
		
		List<String> trainees = Arrays.asList("Lakshya","Swethaa","Ashish","Harini","Swadhi");
		Collections.sort(trainees,sortReverse);
		
		System.out.println(trainees);
		
		
	
		
		
	}
	
}
