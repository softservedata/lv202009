package com.softserve.edu.hw6;

import com.softserve.edu.hw5.Product;

public class Coffee extends Product {
	private int aroma;

	public Coffee(int aroma, int price) {
		super("Coffee", price);
		this.aroma = aroma;
	}

	public int getAroma() {
		return aroma;
	}

	public void setAroma(int aroma) {
		this.aroma = aroma;
	}

	@Override
	public String toString() {
		String result = super.toString();
		int beginIndex = result.indexOf("[");
		int endIndex = result.length() - 1;
		result = result.substring(beginIndex, endIndex);
		return "Coffee [" + result + ", aroma=" + aroma + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + aroma;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((!super.equals(obj)) || (getClass() != obj.getClass()))
			return false;
		Coffee other = null;
		if (obj instanceof Coffee)
			other = (Coffee) obj;
		if (other == null)
			return false;
		
		return aroma == other.aroma;
	}

}
