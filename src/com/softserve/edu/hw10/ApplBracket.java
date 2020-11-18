package com.softserve.edu.hw10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;




public class ApplBracket {
	
	private static final String OPEN_BRACKETS  = "([{"; // check this
	private static final String CLOSE_BRACKETS  = ")]}";
	
	public static void main(String[] args) {
		Map<String, String> brackets = new HashMap<>();
		brackets.put("(", ")");
		brackets.put("[", "]");
		brackets.put("{", "}");
		List<String> lst = Arrays.asList(  "()", "() [\\}] {}", "{(())\\(}", "(\\ ()", "(]", ") (", "([)] ");
		Stack<String> stack = new Stack<String>();
		
		for (String current : lst) {
			System.out.println("\nCurrent = "+ current);
			//current = current.replaceAll("\\(|\\)|\\{|\\}|\\[|\\]", "");
			current = current.replace("\\(", "").replace("\\)", "")
					.replace("\\[", "").replace("\\]", "")
					.replace("\\{", "").replace("\\}", "");
			System.out.println("\nUpdated = "+ current);
			
			
			boolean result = true;
			for (int i=0; i<current.length(); i++) {
				String symbol = current.substring(i, i+1);
				if (OPEN_BRACKETS.contains(symbol)) {
					stack.push(brackets.get(symbol));
					
				} 	else if (CLOSE_BRACKETS.contains(symbol)) {
					String topElement = stack.pop();
					if (!topElement.equals(symbol)) {
						result = false;
						break;
					}
					
				}
			}
			result = result && stack.isEmpty();
			System.out.println(" Result = ", + result);
		}
		
	}
}
