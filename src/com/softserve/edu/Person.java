package com.softserve.edu;

public class Person {

	public static void print(String welcomeMessage, Object... messages) {
		System.out.print(welcomeMessage);
		for (Object msg : messages) {
			System.out.print(msg);
		}
	}

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
