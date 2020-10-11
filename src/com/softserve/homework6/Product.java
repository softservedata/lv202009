package com.softserve.homework6;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

public class Product {

	private String productName;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	protected int productPrice;

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public Product(String productName, int productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (productPrice != other.productPrice)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int productPrice = getProductPrice();
		int result = 1;
		result = productPrice * result + productPrice;
		result = productPrice * result + ((productName == null) ? 0 : productName.hashCode());
		return result;
	}

	public static void main(String[] args) throws IOException {

		Product product1 = new Product("Milk", 34);
		Product product2 = new Product("Ice cream", 27);
		Product product3 = new Product("Potato", 13);
		Product product4 = new Product("Bread", 15);
		Product product5 = new Product("Chocolate", 60);
		Product product6 = new Product("Bread", 15);
		Product product7 = new Product("Rice", 42);
		Product product8 = new Product("Yogurt", 17);
		Product product9 = new Product("Cake", 275);
		Product product10 = new Product("Meat", 420);

		int max1 = Math.max(product1.productPrice, product2.productPrice);
		int max2 = Math.max(product3.productPrice, product4.productPrice);
		int max3 = Math.max(max1, max2);
		int max4 = Math.max(product5.productPrice, product6.productPrice);
		int max5 = Math.max(product7.productPrice, product8.productPrice);
		int max6 = Math.max(max4, max5);
		int max7 = Math.max(product9.productPrice, product7.productPrice);
		int max8 = Math.max(product10.productPrice, max7);
		int max9 = Math.max(max3, max6);
		int max10 = Math.max(max8, max9);

		int[] arr = { 34, 27, 13, 15, 60, 15, 42, 17, 275, 420 };
		int max = 0;
		int imax = 0;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] > max) {
				max = arr[i];
				imax = i;
			}
			i++;
		}
		System.out.print("Maximum product price = " + max);
		System.out.println(" it is in " + (imax + 1) + " place");

		if (max10 == product1.productPrice) {
			System.out.println("The most expensive product is " + product1.getProductName() + " product1.hashCode() = "
					+ product1.hashCode());
		} else if (max10 == product2.productPrice) {
			System.out.println("The most expensive product is " + product2.getProductName() + " product2.hashCode() = "
					+ product2.hashCode());
		} else if (max10 == product3.productPrice) {
			System.out.println("The most expensive product is " + product3.getProductName() + " product3.hashCode() = "
					+ product3.hashCode());
		} else if (max10 == product4.productPrice) {
			System.out.println("The most expensive product is " + product4.getProductName() + " product4.hashCode() = "
					+ product4.hashCode());
		} else if (max10 == product5.productPrice) {
			System.out.println("The most expensive product is " + product5.getProductName() + " product5.hashCode() = "
					+ product5.hashCode());
		} else if (max10 == product6.productPrice) {
			System.out.println("The most expensive product is " + product6.getProductName() + " product6.hashCode() = "
					+ product6.hashCode());
		} else if (max10 == product7.productPrice) {
			System.out.println("The most expensive product is " + product7.getProductName() + " product7.hashCode() = "
					+ product7.hashCode());
		} else if (max10 == product8.productPrice) {
			System.out.println("The most expensive product is " + product8.getProductName() + " product8.hashCode() = "
					+ product8.hashCode());
		} else if (max10 == product9.productPrice) {
			System.out.println("The most expensive product is " + product9.getProductName() + " product9.hashCode() = "
					+ product9.hashCode());
		} else if (max10 == product10.productPrice) {
			System.out.println("The most expensive product is " + product10.getProductName()
					+ " product10.hashCode() = " + product10.hashCode());
		}

		if (product4.equals(product6) == true) {
			System.out.println("The same products were found - is a " + product4.getProductName());
		}

		HashMap<Integer, Integer> duplicates = new HashMap<Integer, Integer>();
		for (int j = 0; j < arr.length; j++) {
			if (duplicates.containsKey(arr[j])) {
				int numberOfOccurances = duplicates.get(arr[j]);
				duplicates.put(arr[j], (numberOfOccurances + 1));
			} else {
				duplicates.put(arr[j], 1);
			}
		}
		Iterator<Integer> keys = duplicates.keySet().iterator();
		System.out.print("Duplicated product prices equal: ");
		while (keys.hasNext()) {
			int k = keys.next();
			if (duplicates.get(k) > 1) {
				System.out.print(" " + k);
			}
		}
	}
}
