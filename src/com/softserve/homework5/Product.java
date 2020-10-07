package com.softserve.homework5;

import java.io.IOException;

public class Product {

	private String productName;

	public String getProducName() {
		return productName;
	}

	public void setProductName(String producName) {
		this.productName = producName;
	}

	private int productPrice;

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public Product(String producName, int productPrice) {
		super();
		this.productName = producName;
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
		final int productPrice = 31;
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
		Product product10 = new Product("Meat", 120);

		int max1 = Math.max(product1.productPrice, product2.productPrice);
		int max2 = Math.max(product3.productPrice, product4.productPrice);
		int max3 = Math.max(max1, max2);
		int max4 = Math.max(product5.productPrice, product6.productPrice);
		int max5 = Math.max(product7.productPrice, product8.productPrice);
		int max6 = Math.max(max4, max5);
		int max7 = Math.max(product9.productPrice, product7.productPrice);
		int max8 = Math.max(max3, max6);
		int max9 = Math.max(max7, max8);

		int[] arr = { 34, 27, 13, 15, 60, 15, 42, 17, 275, 120 };
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
		System.out.print("Maximum = " + max);
		System.out.println(" is in " + (imax + 1) + " place");

		if (max9 == product1.productPrice) {
			System.out.println("The most expensive product is " + product1.getProducName());
		} else if (max9 == product2.productPrice) {
			System.out.println("The most expensive product is " + product2.getProducName());
		} else if (max9 == product3.productPrice) {
			System.out.println("The most expensive product is " + product3.getProducName());
		} else if (max9 == product4.productPrice) {
			System.out.println("The most expensive product is " + product4.getProducName());
		} else if (max9 == product5.productPrice) {
			System.out.println("The most expensive product is " + product5.getProducName());
		} else if (max9 == product6.productPrice) {
			System.out.println("The most expensive product is " + product6.getProducName());
		} else if (max9 == product7.productPrice) {
			System.out.println("The most expensive product is " + product7.getProducName());
		} else if (max9 == product8.productPrice) {
			System.out.println("The most expensive product is " + product8.getProducName());
		} else if (max9 == product9.productPrice) {
			System.out.println("The most expensive product is " + product9.getProducName());
		} else if (max9 == product10.productPrice) {
			System.out.println("The most expensive product is " + product10.getProducName());
		}

		if (product4.equals(product6) == true) {
			System.out.println("The same products were found. It is a " + product4.getProducName());
		}

	}
}
