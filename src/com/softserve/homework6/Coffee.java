package com.softserve.homework6;

public class Coffee extends Product{
	
	private int productAroma;

	public Coffee(String productName, int productPrice, int productAroma) {
		super(productName, productPrice);
		this.setProductAroma(productAroma);
		// TODO Auto-generated constructor stub
	}

	public int getProductAroma() {
		return productAroma;
	}

	public void setProductAroma(int productAroma) {
		this.productAroma = productAroma;
	}

	@Override
	public String toString() {
		return "Coffee [productAroma=" + productAroma + ", productPrice=" + productPrice + ", getProductAroma()="
				+ getProductAroma() + ", getProductName()=" + getProductName() + ", getProductPrice()="
				+ getProductPrice() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + productAroma;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coffee other = (Coffee) obj;
		if (productAroma != other.productAroma)
			return false;
		return true;
	}
	

	
}
