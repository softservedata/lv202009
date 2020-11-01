package com.softserve.edu.hw6;

public class Appl {
    public static void main(String[] args) {
        Product[] products = { new Coffee(5, 20), new Wine(WineCountry.SPAIN, 300), new Product("Water", 20),
                        new Wine(WineCountry.SPAIN, 400), new Coffee(8, 40), new Product("Bear", 50),
                        new Product("Milk", 20), new Coffee(8, 30), new Wine(WineCountry.FRANCE, 300),
                        new Product("Bear", 50), new Product("Milk", 10), new Coffee(8, 50),
                        new Wine(WineCountry.SPAIN, 200) };
        
        Product startWine = null;
        for (int i = 0; i < products.length; i++) {
            if (products[i] instanceof Wine) {
                startWine = products[i];
                break;
            }
        }
        if ((startWine != null) && (startWine instanceof Wine)) {
            Wine maxWine = (Wine) startWine;
            for (int i = 0; i < products.length; i++) {
                if (products[i] instanceof Wine) {
                    Wine currentWine = (Wine) products[i];
                    if ((currentWine.getCountry() == WineCountry.SPAIN)
                            && (maxWine.getPrice() < currentWine.getPrice())) {
                        maxWine = currentWine;
                    }
                }
            }
            System.out.println("Wine = " + maxWine);
        } else {
            System.out.println("Wine not found");
        }
        Product startCoffee = null;
        for (int i = 0; i < products.length; i++) {
            if (products[i] instanceof Coffee) {
                startCoffee = products[i];
                break;
            }
        }
        if ((startCoffee != null) && (startCoffee instanceof Coffee)) {
            Coffee minCoffee = (Coffee) startCoffee;
            for (int i = 0; i < products.length; i++) {
                if (products[i] instanceof Coffee) {
                    Coffee currentCoffee = (Coffee) products[i];
                    if (minCoffee.getAromat() < currentCoffee.getAromat()) {
                        minCoffee = currentCoffee;
                        continue;
                    } else if ((minCoffee.getAromat() == currentCoffee.getAromat())
                            && (minCoffee.getPrice() > currentCoffee.getPrice())) {
                        minCoffee = currentCoffee;
                    }
                }
            }
            System.out.println("Coffee = " + minCoffee);
        } else {
            System.out.println("Coffee not found");
        }
    }
}
