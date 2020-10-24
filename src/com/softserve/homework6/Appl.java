package com.softserve.homework6;

import com.softserve.homework5.Product;

public class Appl {

    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Rectangle(5, 6);
        figures[1] = new Rectangle(3, 7);
        figures[2] = new Square(6);
        figures[3] = new Square(7);
        figures[4] = new Square(4);

        for (Figure figure : figures) {
            System.out.println(figure.toString());
        }
        
        Product[] products = new Product[8];
        products[0] = new Coffee("Galka", 2, 5);
        products[1] = new Coffee("Lavazza", 5, 10);
        products[2] = new Coffee("Jakobs", 25, 4);
        products[3] = new Coffee("Espreso", 19.8f, 10);
        products[4] = new Wine("Inkerman", 34.5f, "Ukraine");
        products[5] = new Wine("Viejo", 100.25f, "Spain");
        products[6] = new Wine("Blanca", 80, "Spain");
        products[7] = new Wine("Sicilia", 200f, "Italy");

        Wine mostExpensiveWine = null;
        Coffee cheapestCoffee = null;
        for (Product product : products) {
            if (product.getClass() == Wine.class) {
                if ("Spain".equals(((Wine) product).getOrigin())) {
                    if (mostExpensiveWine == null) {
                        mostExpensiveWine = (Wine) product;
                    }
                    if (mostExpensiveWine.getProductPrice() < product.getProductPrice()) {
                        mostExpensiveWine = (Wine) product;
                    }
                }
            } else if (product.getClass() == Coffee.class) {
                if (cheapestCoffee == null) {
                    cheapestCoffee = (Coffee) product;
                }
                if (cheapestCoffee.getScent() < ((Coffee) product).getScent()) {
                    cheapestCoffee = (Coffee) product;
                }
                if (cheapestCoffee.getScent() == ((Coffee) product).getScent() &&
                        cheapestCoffee.getProductPrice() > product.getProductPrice()) {
                    cheapestCoffee = (Coffee) product;
                }
            }
        }

        if (mostExpensiveWine != null) {
            System.out.println("The most expensive Spanish wine is " + mostExpensiveWine.getProductName());
        }
        if (cheapestCoffee != null) {
            System.out.println("The cheapest and most aromatic coffee is " + cheapestCoffee.getProductName());
        }
    }
}


