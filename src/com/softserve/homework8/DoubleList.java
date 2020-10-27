package com.softserve.homework8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class DoubleList implements Comparable<DoubleList> {

	public DoubleList(String string) {
		super();
		this.value = string;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DoubleList other = (DoubleList) obj;
		if (value != other.value)
			return false;
		return true;
	}

	@Override
	public String toString() {
		//return "DoubleList [value=" + value + "]";
		return value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = getValue();
	}

	public static void setValueComparator(ValueComparator valueComparator) {
		DoubleList.valueComparator = valueComparator;
	}

	String value;

	static ValueComparator valueComparator = new ValueComparator();

	public static ValueComparator getValueComparator() {
		return valueComparator;
	}

	static class ValueComparator implements Comparator<Object> {
		public int compare(Object set, Object set1) {
			return ((DoubleList) set).getValue().compareTo(((DoubleList) set1).getValue());
		}
	}

	public static List<DoubleList> bothLists(Set<DoubleList> set, Set<DoubleList> set1) {
		List<DoubleList> result = new ArrayList<>();
		for (DoubleList current : set) {
			if (set1.contains(current)) {
				result.add(current);
				set1.remove(current);
			}
		}
		return result;
	}

	@Override
	public int compareTo(DoubleList o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
