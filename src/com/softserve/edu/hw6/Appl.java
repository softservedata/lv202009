package com.softserve.edu.hw6;

public class Appl {

	public static void main(String[] args) {
		Figure[] f = {new Rectangle(3, 5), new Rectangle(4, 2), new Square(3),
				new Square(2) ,new Square(13) };
		
//printout perimeters of array elements
		for (int i = 0; i <= f.length-1; i++) {
		System.out.println(f[i].toString());  // why I can't just put "getArea()" inside this class???

		}
		
		
		
		
	}
}