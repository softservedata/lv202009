package com.softserve.edu.hw2;

import java.util.Arrays;

public class Appl {
	public static void main(String[] args) {
		int k = 16;
//	 	System.out.println("k=" + k++);
//	 	System.out.println("k=" + ++k);
//	 	System.out.println("k=" + k+++k);
//	 	System.out.println("k=" + (50-(--k)));
//	 	System.out.println("k=" + k*k);
//	 	System.out.println("k=" + k/3);
//	 	System.out.println("k=" + k%3);
//	 	System.out.println("k=" + (k++<++k));
	 	 k = 16;
	 	 int[] array = {k++, ++k, k+++k, 50-(--k), k*k, k/3, k%3};
	 	 Arrays.toString(array);
	 	 for (int i = 0; i < 7; i++) {
	 		 System.out.println("k = " + array[i]);
	 		}
	 	 System.out.println("k = " + (k++<++k));
	}
}
