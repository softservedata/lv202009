package com.softserve.homework8;

import java.util.Set;
import java.util.TreeSet;

public class Appl {
	public static void main(String[] args) {
		Set<DoubleList> set = new TreeSet<DoubleList>(DoubleList.getValueComparator());
		set.add(new DoubleList("33"));
		set.add(new DoubleList("666"));
		set.add(new DoubleList("55"));
		set.add(new DoubleList("7"));
		set.add(new DoubleList("1"));
		set.add(new DoubleList("33"));
		System.out.println(set);

		Set<DoubleList> set1 = new TreeSet<DoubleList>(DoubleList.getValueComparator());
		set1.add(new DoubleList("4"));
		set1.add(new DoubleList("77"));
		set1.add(new DoubleList("55"));
		set1.add(new DoubleList("999"));
		set1.add(new DoubleList("1"));
		set1.add(new DoubleList("33"));
		set1.add(new DoubleList("33"));
		set1.add(new DoubleList("4"));
		System.out.println(set1);

		
	}
}
