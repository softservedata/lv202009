package com.softserve.edudrafts;

public class Amount {
	public static void main(String[] args) {
		
		int arr[] = {13, 4, 9, -28, -72, 1, 5, 17};
		int amount = 0;
		for (int a = 0; a < arr.length; a++) {
			if(arr[a] > 0 && a <=7) {
				amount++;
			}
			System.out.println("a = " + a + " arr[a] = " + arr[a] + " amount = " + amount);
		}
	}

}
