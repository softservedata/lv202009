package com.softserve.edu.hw7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.softserve.edu.hw5.Product;

public class ApplContent3 {
	
	
	public static void main(String[] args) {
	List <Product> list1 = Arrays.asList(
			new Product("meat", 120),
			new Product("eggs", 35),
			new Product("coffe", 120),
			new Product("sugar", 27));
		
	List <Product> list2 = Arrays.asList(
			new Product("meat", 120),
			new Product("eggs", 35),
			new Product("coffe", 120),
			new Product("SUGAR", 100000));
		
	
	System.out.println("list1" + list1);
	System.out.println("list2" + list2);
	Set<Product> set1 = new HashSet<>(list1); 
	Set<Product> set2 = new HashSet<>(list2); 
	
	
	System.out.println("set1" + set1);
	System.out.println("set2" + set2);
	
	boolean isEquals = set1.equals(set2);
	System.out.println("isEquals = " + isEquals);
	}

}
