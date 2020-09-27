package com.softserve.edu.hw2;

public class Appl {
	public static void main(String[] args) {
		int k = 16;
	 	System.out.println("k=" + k++);
	 	System.out.println("k=" + ++k);
	 	System.out.println("k=" + k+++k);
	 	System.out.println("k=" + (50-(--k)));
	 	System.out.println("k=" + k*k);
	 	System.out.println("k=" + k/3);
	 	System.out.println("k=" + k%3);
	 	System.out.println("k=" + (k++<++k));
	}
}
