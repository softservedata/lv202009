package com.softserve.edu.hw4;

public class MaxValue {
	public static void main(String[] args) {
		Product p1 = new Product("egg", 3);
		Product p2 = new Product("apple", 10);
		Product p3 = new Product("cheese", 55);
		Product p4 = new Product("toy", 40);
		
		Product max = p1;
		if (max.getPrice() < p2.getPrice()) {
			max = p2;
		}
		if (max.getPrice() < p3.getPrice()) {
			max = p3;
		}
		if (max.getPrice() < p4.getPrice()) {
			max = p4;
		}
		System.out.println("max = " + max);
	}
}
