package com.softserve.edu.hw8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ApplCommon {
	
		public static void main(String[] args) {

			List<Integer> list1 = Arrays.asList(3, 1, 2, 1, 3, 2);
			List<Integer> list2 = Arrays.asList(3, 1, 3, 1, 3, 2, 2, 4);
			

			//boolean isEquals = true;
			List<Integer> result = new ArrayList<>();
			for (int i = 0; i<list1.size(); i++) {
				boolean isExist = false;
				for (int j = 0; j<list2.size(); j++) {
					if (list1.get(i)==list2.get(j)) {
						isExist = true;
						break;
					}
				}
			if (isExist&& !result.contains(list1.get(i))) {
				result.add(list1.get(i));
			}
			

			}
			
			
			//isEquals = isEquals&&isExist;
			

			
			System.out.println(result);
			
		}
	}


