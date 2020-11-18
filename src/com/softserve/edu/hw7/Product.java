package com.softserve.edu.hw7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Product {
		

	

		private String name;
		private int price;
		
		public Product(String name, int price) {
			this.name = name;
			this.price = price;
		}

		public Product() {
			name = "";
			price = 0;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Product [name = " + name + ", price = " + price + "]";

		}

		public static void main(String[] args) {
			Product p1 = new Product("meat", 120);
			Product p2 = new Product("eggs", 35);
			Product p3 = new Product("coffe", 120);
			Product p4 = new Product("sugar", 27);

			List<Product> productList = new ArrayList<>();
			productList.add(p1);
			productList.add(p2);
			productList.add(p3);
			productList.add(p4);

			Product product = Collections.max(productList, Comparator.comparing(s -> s.getPrice()));
			System.out.println("The bigger price is for: " + product.getName());

			// added for hw5
			Product[] pr = new Product[10];
			pr[0] = new Product("sault", 10);
			pr[1] = new Product("sweets", 10);
			pr[2] = new Product("candy", 34);
			pr[3] = new Product("milk", 19);
			pr[4] = new Product("sault", 10);
			pr[5] = new Product("nothing", 10);
			pr[6] = new Product("apple", 100);
			pr[7] = new Product("orange", 12);
			pr[8] = new Product("pepper", 14);
			pr[9] = new Product("orange", 20);
			
			//check if equals
			for (int i = 0; i <= pr.length - 1; i++) {
				for (int j = i + 1; j <= pr.length - 1; j++) {
					if (pr[i].equals(pr[j])) {
						System.out.println("equals - Same products: " + pr[i] + pr[j]);
					}
				}
			}

		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + price;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if ((obj == null)||(getClass() != obj.getClass()))
				return false;
			Product other = null;
			if (obj instanceof Product)
				other = (Product) obj;
			//
			if ((price != other.price)
				|| (other == null)
				|| ((name == null) && (other.name != null))
				|| ((name != null) && (other.name == null))) {
					return false;
				}
			
			if ((name != null) && (other.name != null))
				return true;
			
		
			return name.equals(other.name);
		}

		
	}


