package com.softserve.edu09.box;

public class Appl {
	public static void main(String[] args) {
		// Box box = new Box();
		// BoxWrapper box = new BoxWrapper();
		BoxGen<Integer> box = new BoxGen<>();
		//
		box.set(123); // Convert to new Integer(123)
		// Code ...
		String text = "Hello World";
		// box.set(text); // Compile Error for new BoxWrapper(); and new BoxGen<>();
		//
		// Integer i = (Integer) box.get(); // Code Smell if Box box = new Box();
		Integer i = box.get();
		//
		System.out.println("i = " + i);
	}

}
