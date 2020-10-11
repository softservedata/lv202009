package com.softserve.homework6;

import java.util.Objects;

public class Wine extends Product {

	public Wine(String productName, int productPrice, String productCountry) {
		super(productName, productPrice);
		this.productCountry = productCountry;
		// TODO Auto-generated constructor stub
	}

	private String productCountry;

	public String getProductCountry() {
		return productCountry;
	}

	public void setProductCountry(String productCountry) {
		this.productCountry = productCountry;
	}

	@Override
	public String toString() {
	    System.out.println("Wine: " + getProductName()+ " Price = " +getProductPrice()+ " hrn" + "  Country: " + getProductCountry());
		return super.toString();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(super.hashCode(), productCountry);
	}
	
	@Override
	public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Wine wine = (Wine) obj;
        return Objects.equals(productCountry, wine.productCountry) && productPrice == wine.productPrice;
	}
}
