package com.softserve.homework7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Appl {
	public static void main(String[] args) {

		List<String> lstStr1 = new ArrayList<>();
		lstStr1.add("222");
		lstStr1.add("1");
		lstStr1.add("1111");
		lstStr1.add("10");
		lstStr1.add("10");
		lstStr1.add("333");
		System.out.println("Original: lstStr1 = " + lstStr1);
		lstStr1.add(2, "99");
		System.out.println("add 99: lstStr1 = " + lstStr1);
		Collections.sort(lstStr1);
		System.out.println("Sorted: lstStr1 = " + lstStr1);

		for (String current : lstStr1) {
			System.out.println(current);
		}

		for (int i = 0; i < lstStr1.size(); i++) {
			System.out.println("element[" + i + "] = " + lstStr1.get(i));
		}

		List<String> lstStr2 = new ArrayList<>();
		lstStr2.add("66");
		lstStr2.add("1");
		lstStr2.add("4");
		lstStr2.add("777");
		lstStr2.add("333");
		System.out.println("\nOriginal: lstStr2 = " + lstStr2);
		lstStr2.add(2, "10");
		System.out.println("add 10: lstStr2 = " + lstStr2);
		Collections.sort(lstStr2);
		System.out.println("Sorted: lstStr2 = " + lstStr2);

		for (String current : lstStr2) {
			System.out.println(current);
		}

		for (int j = 0; j < lstStr2.size(); j++) {
			System.out.println("element[" + j + "] = " + lstStr2.get(j));
		}

		for (int i = 0; i < lstStr1.size(); i++) {
			for (int j = 0; j < lstStr2.size(); j++) {
				if (lstStr1.get(i) == lstStr2.get(j)) {
					System.out.println("lstStr1 element[" + i + "] = " + lstStr1.get(i) + " = " + "lstStr2 element[" + j
							+ "] = " + lstStr2.get(j));
				}
			}
		}
	}
}
