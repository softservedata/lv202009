package com.softserve.edu.hw5;

public class Main {
    public static Product[] getEqualProducts (Product[] product_list) {
        for (int p = 0; p < product_list.length; p++) {
            for (int p2 = 0; p2 < product_list.length; p2++) {
                if (p == p2) {
                    continue;
                }
                boolean equal = product_list[p].equals(product_list[p2]);
                if (equal) {
                    return new Product[]{product_list[p], product_list[p2]};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = new Product[] {
                new Product("Strawberry", -25.50),
                new Product("Raspberry", 34.34),
                new Product("Cherry", 47.47),
                new Product("Blueberry", 0.53),
                new Product("Blueberry", 0.53),
                new Product("Blueberry", 10.53),
                new Product("Orange", 15.51),
                new Product("Tangerine", 22.89),
                new Product("Banana", 45.53),
                new Product("Apricot", 12.34),
        };

        Product ProductWithMaxPrice = Product.GetMaxProduct(products);
        System.out.println("Product with Max Price - " + ProductWithMaxPrice);
        System.out.println("Product with Max Price hashcode: " + ProductWithMaxPrice.hashCode());

        Product[] equalProducts = getEqualProducts(products);
        if (equalProducts != null) {
            System.out.println("Equal Products: " + "1 - " + equalProducts[0] + "; " + "2 - " + equalProducts[1]);
        }
    }
}
