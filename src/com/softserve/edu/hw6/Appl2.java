package com.softserve.edu.hw6;

import com.softserve.edu.hw5.Product;

import java.util.Arrays;

public class Appl2 {
    public static void main(String[] args) {
        Figure[] figures = new Figure[]{
                new Rectangle(3.5, 4.4),
                new Rectangle(8.9, 7.8),
                new Square(1.1),
                new Square(9.9),
                new Square(7.7),
        };

        for (int i = 0; i < figures.length; i++) {
            System.out.println("Figure: " + figures[i].toString() +
                    " Figure perimeter: " + figures[i].perimeter());
        }

        Product[] CoffeeWine = new Product[]{
            new Coffee("Ethiopia", 25, 10),
            new Coffee("Guatemala", 23, 10),
            new Coffee("Kenya", 23, 5),
            new Coffee("Honduras", 24, 7),
            new Wine("Vinho Verde", 180, "Spain"),
            new Wine("Merlot", 170, "France"),
            new Wine("Sauvignon", 165, "Spain")
        };

        Coffee[] CoffeeArray = new Coffee[10];
        Wine[] WineArray = new Wine[10];
        int c = 0;
        int w = 0;
        for (Product product : CoffeeWine) {
            if (product instanceof Coffee) {
                CoffeeArray[c] = (Coffee) product;
                c = c + 1;
            } else {
                WineArray[w] = (Wine) product;
                w = w + 1;
            }
        }

        Coffee BestCoffee = Coffee.GetBestCoffee(CoffeeArray);
        System.out.println("The cheapest and most aromatic coffee - " + BestCoffee);
        Wine BestWine = Wine.GetBestWine(WineArray);
        System.out.println("The most expensive Spanish Wine - " + BestWine);
    }
}