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
	if (pet.equalsIgnoreCase("yes")){
		System.out.println("What is it name");
		String petName = br.readLine();
		System.out.println("Hello " + name + "!");  
		System.out.println("You are " + age + " years old");
		System.out.println("You have pet and it's name is " + petName);
	} else
	{System.out.println("Goodbye ");}
	  }
	}

	
	


