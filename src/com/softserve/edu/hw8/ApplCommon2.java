package com.softserve.edu.hw8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ApplCommon2 {
	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(3, 1, 2, 1, 3, 2);
		List<Integer> list2 = Arrays.asList(3, 1, 3, 1, 3, 2, 2, 4);
	
	Set<Integer> common = new HashSet<>(list1);
	common.retainAll(list2);
	System.out.println("common = " + common);
	List<Integer> result = new ArrayList<>(common);
	System.out.println("result = " + result);
	
	}
	
}
