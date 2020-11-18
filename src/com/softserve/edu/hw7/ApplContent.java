package com.softserve.edu.hw7;

import java.util.Arrays;
import java.util.List;

public class ApplContent {
	public static void main (String[] args)  {
		
		List<Integer> list1= Arrays.asList(1, 2, 1, 3, 2);
		List<Integer> list2= Arrays.asList(1, 3, 1, 3, 2, 2, 4);
		
		
		
		boolean isEquals = true;
		for (int i = 0; i<list1.size(); i++) {
			boolean isExist = false;
			for (int j = 0; j<list2.size(); j++) {
				if (list1.get(i)==list2.get(j)) {
					isExist = true;
					break;
				}
			}
		isEquals = isEquals&&isExist;
		

		}
		
		for (int j = 0; j<list2.size(); j++) {
			boolean isExist = false;
			for (int i = 0; j<list1.size(); i++) {
				if (list1.get(i)==list2.get(j)) {
					isExist = true;
					break;
				}
			}
		isEquals = isEquals&&isExist;
		

		}
		System.out.println(isEquals);
	}

}
