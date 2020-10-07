package com.softserve.edu;

public class Example {

	//System.out.println("My first program firsova");
	//for (int i = 0; i < args.length; i++) {
	//System.out.println("Arg " + i + " is " + args[i]);
	//}
	
	public static void print(String welcomeMessage, Object... messages) 
	{
		System.out.print(welcomeMessage);
		for (Object msg : messages) {
			System.out.print(msg);
		}

		Person p = new Person();
		p.name("Ivan");
		p.print();
		p.print("Hello ");
		p.print("Hello ", " time ", 12);
		p.print("Hello ", " time ", 12, 00, dtrhj);
	}
}

