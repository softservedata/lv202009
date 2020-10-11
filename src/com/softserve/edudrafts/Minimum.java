package com.softserve.edudrafts;

public class Minimum {
	public static void main(String[] args) {

		int[][] arr = { { 34 }, { 13, 15 }, { 60, 15 }, { -42, 17 }, { 275, -420, 0, 17, 8 }, { 900, 1 } };
		int min = arr[0][0];
		int imin = 0;
		int jmin = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
					imin = i+1;
					jmin = j+1;
				}

			}

		}
		System.out.print("Minimum product price min = " + min + " position" + " imin = " + imin + " jmin = " + jmin);
	}
}
