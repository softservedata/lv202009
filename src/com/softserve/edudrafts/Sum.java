package com.softserve.edudrafts;

import java.util.Arrays;

public class Sum {
	public static void main(String[] args) {
		int sum = 0;
		int arr[] = { 13, 4, 9, -28, -72, 1, 5, 17 };
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("arr = " + arr + "\narr.hashCode() = " + arr.hashCode() + "\narr.Arrays.toString(arr) " + Arrays.toString(arr)
				+ " Sum of array = " + sum);
		for (int j = 0; j < arr.length; j++) {
			System.out.println(" arr[j] = " + arr[j]);
		}

	}

}
