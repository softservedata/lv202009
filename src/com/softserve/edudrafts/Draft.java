package com.softserve.edudrafts;

public class Draft {
	public static void main(String[] args) {

		int[] arr = { 34, 27, 13, 15, 60, 15, 42, 17, 275, 420, 900 };
		int max = 0;
		//int imax = 0;
		int i=0;
		while (i < arr.length) {
			if (arr[i] > max) {
				max = arr[i];
				//imax = i;
			}
			i++;
		}

		System.out.print("Maximum product price +max = " + max);
		System.out.println("\n it is in imax =" + (i) + " place");
	}
}
