package com.softserve.homework8;

import java.util.Comparator;

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
		return "DoubleList [value=" + value + "]";
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
		public int compare(Object v1, Object v2) {
			return ((DoubleList) v1).getValue().compareTo(((DoubleList) v2).getValue());
		}
	}

	@Override
	public int compareTo(DoubleList o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
