package com.softserve.edu13;

import java.util.Scanner;

public class ConsoleUtil {
	private static Scanner scanner;

	static {
		scanner = new Scanner(System.in);
		System.out.println("ConsoleUtil static done");
	}

	public static void printDouble(String message, Double... doubles) {
		System.out.print(message);
		for (Double current : doubles) {
			System.out.println(" " + current);
		}
	}

	public static double readDouble(String message) {
		System.out.print(message);
		return scanner.nextDouble();
	}

	public static void close() {
		scanner.close();
	}

}