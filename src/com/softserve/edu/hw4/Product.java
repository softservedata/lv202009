package com.softserve.edu.hw4;

public class Product {

	private String name;
	private double price;

	public Product() {
		name = "";
		price = 0;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product{" + "name='" + name + '\'' + ", price=" + price + '}';
	}
}
