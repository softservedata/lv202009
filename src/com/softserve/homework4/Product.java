package com.softserve.homework4;

import java.io.IOException;

public class Product {

	private String producName;

	public String getProducName() {
		return producName;
	}

	public void setProducName(String producName) {
		this.producName = producName;
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
		this.producName = producName;
		this.productPrice = productPrice;
	}

	public static void main(String[] args) throws IOException {

		Product product1 = new Product("Milk", 34);
		Product product2 = new Product("Ice cream", 27);
		Product product3 = new Product("Potato", 13);
		Product product4 = new Product("Bread", 15);

		int max1 = Math.max(product1.productPrice, product2.productPrice);
		int max2 = Math.max(product3.productPrice, product4.productPrice);
		int max3 = Math.max(max1, max2);

		if (max3 == product1.productPrice) {
			System.out.println("The most expensive product is " + product1.producName);
		} else if (max3 == product2.productPrice) {
			System.out.println("The most expensive product is " + product2.producName);
		} else if (max3 == product3.productPrice) {
			System.out.println("The most expensive product is " + product3.producName);
		} else if (max3 == product4.productPrice) {
			System.out.println("The most expensive product is " + product4.producName);
		}
	}
}
