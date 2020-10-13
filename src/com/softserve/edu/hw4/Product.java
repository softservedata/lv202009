
package com.softserve.edu.hw4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Product {

	private String name;
	private double price;

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		Product p1 = new Product ("meat", 120);
		Product p2 = new Product ("eggs", 35);
		Product p3 = new Product ("coffe", 120.5);
		Product p4 = new Product ("sugar", 27);

		List<Product> productList = new ArrayList<>();
		productList.add (p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);

        Product product =  Collections.max(productList, Comparator.comparing(s -> s.getPrice()));
        System.out.println("The biggest price is for: " + product.getName());





	}


}

