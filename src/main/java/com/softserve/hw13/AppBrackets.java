package com.softserve.hw13;

import java.util.Arrays;
import java.util.List;

public class AppBrackets {
	public static void main(String[] args) {
		Brackets brackets = new Brackets();
		List<String> lst = Arrays.asList("(\\[)", 
				"() [\\}] {}", 
				"{(())\\(}", 
				"(\\ ()", 
				"(]", 
				") (", 
				"([)] "
				);
		for (String current : lst) {
			System.out.println("\nCurrent = " + current + "  result = " + brackets.verifyBrackets(current));
		}
	}
}