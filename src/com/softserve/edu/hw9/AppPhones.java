package com.softserve.edu.hw9;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppPhones {
	private static final String LOCAL = "loc"; // check this
	
	public static void main(String[] args) {
		
		
		List<String> lst = Arrays.asList( "093 987 65 43", "(050)1234567", "12-345", 
				    "067-21-436-57", "050-2345678", "0939182736", "224-19-28",
				    "(093)-11-22-334", "044 435-62-18", "721-73-45");
		
		Map<String, List<String>> map = new HashMap<>();
		List<String> phones = null;
		for(String current : lst) {
			current = current.replace(" ", "").replace("-","").replace(")","").replace("(","");
			
			current= current.replaceAll(" | -|\\(|\\)", "").trim();
		
			System.out.println(current);
			
			switch (current.length()) {
			case 7:
				 phones = map.get(LOCAL);
				 if (phones == null) {
					 phones = new ArrayList<>();
					 map.put(LOCAL, phones);
				 }
				 phones.add(current);
				 break;
				 
			case 10:
				String code = current.substring(0,3); //0,1,2
				phones = map.get(code);
				 if (phones == null) {
					 phones = new ArrayList<>();
					 map.put(code, phones);
				 }
				 phones.add(current.substring(3));
				 break;
				default:
			}
		}
		System.out.println("Result= ", + result);
	}
}
