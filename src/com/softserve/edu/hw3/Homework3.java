package com.softserve.edu.hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework3 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Hello. What is your name?");
		String name = br.readLine();
		System.out.println("How old are you?");
		int age = Integer.parseInt(br.readLine());
		System.out.println("Do you have pet?");
		String pet = br.readLine();
		if (pet.equalsIgnoreCase("yes")) {
			System.out.println("What is it name");
			String petName = br.readLine();
			System.out.println("Hello " + name + "!");
			System.out.println("You are " + age + " years old");
			System.out.println("You have pet and it's name is " + petName);
		} else {
			System.out.println("Goodbye ");
		}

		System.out.println("Enter first numbers and press Enter btn");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter second numbers and press Enter btn");
		int b = Integer.parseInt(br.readLine());
		System.out.println("Enter third numbers and press Enter btn");
		int c = Integer.parseInt(br.readLine());
		if (a < b & b < c) {
			System.out.println("ASC order: " + a + " " + b + " " + c);
		} else if (a < c & c < b) {
			System.out.println("ASC order: " + a + " " + c + " " + b);
		} else if (b < a & a < c) {
			System.out.println("ASC order: " + b + " " + a + " " + c);
		} else if (b < c & c < a) {
			System.out.println("ASC order: " + b + " " + c + " " + a);
		} else if (c < a & a < b) {
			System.out.println("ASC order: " + c + " " + a + " " + b);
		} else if (c < b & b > a) {
			System.out.println("ASC order: " + c + " " + b + " " + a);
		}
	}
}
