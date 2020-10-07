package com.softserve.edu;

public class Person {

	private String name; // must be private

	// Overload
	public void print() {
		System.out.println(name);
	}

	// Overload
	public void print(String s) {
		System.out.println(s + " " + name);
	}
}
