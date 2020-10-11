package com.softserve.edudrafts;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int[] arr = { 7, -4, 13, 22, 1, 80 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorting ASC = " + Arrays.toString(arr));
		
		int[] arr1 = { 7, -4, 13, 22, 1, 80 };
		for (int i = 0; i < arr1.length - 1; i++) {
			for (int j = 0; j < arr1.length - 1 - i; j++) {
				if (arr1[j] < arr1[j + 1]) {
					int temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorting DESC = " + Arrays.toString(arr1));
	}
}
