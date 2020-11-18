package com.softserve.edu.hw7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ApplContent2 {
	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 2, 1, 3, 2);
		List<Integer> list2 = Arrays.asList(1, 3, 1, 3, 2, 2, 4);
		
		System.out.println("list1" + list1);
		System.out.println("list2" + list2);
		Set<Integer> set1 = new HashSet<>(list1); 
		Set<Integer> set2 = new HashSet<>(list2); 
		
		
		System.out.println("set1" + set1);
		System.out.println("set2" + set2);
		
		boolean isEquals = set1.equals(set2);
		System.out.println("isEquals = " + isEquals);
		
		
	}
}
