package com.softserve.edu.hw3;

import java.util.Scanner;

public class Appl2 {
	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int x;

		Scanner sc = new Scanner(System.in);

		System.out.print("a = ");
		a = sc.nextInt();

		System.out.print("b = ");
		b = sc.nextInt();

		System.out.print("c = ");
		c = sc.nextInt();

		if (a > b) {
			x = a;
			a = b;
			b = x;
		} else
			a = a;
		if (b > c) {
			x = b;
			b = c;
			c = x;
		} else
			b = b;
		if (a > b) {
			x = a;
			a = b;
			b = x;
		} else
			c = c;

		System.out.println("ordered:" + a + " " + b + " " + c);

	}
}