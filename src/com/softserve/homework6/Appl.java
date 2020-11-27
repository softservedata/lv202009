package com.softserve.homework6;

import com.softserve.homework5.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class Appl {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];

        figures[0] = new Rectangle(10, 3);
        figures[1] = new Rectangle(4, 8);
        figures[2] = new Square(6);
        figures[3] = new Square(16);
        figures[4] = new Square(9);

        for (int i = 0; i < figures.length; i++){
            System.out.println("Figure '" + figures[i] + "', perimeter: " + figures[i].calculatePerimeter());
        }

        Product[] products = new Product[10];
        products[0] = new Coffee("Coffee 1", 12, 4);
        products[1] = new Coffee("Coffee 2", 33, 10);
        products[2] = new Coffee("Coffee 3", 50, 8);
        products[3] = new Coffee("Coffee 4", 98, 10);
        products[4] = new Coffee("Coffee 5", 65, 2);
        products[5] = new Wine("Wine 1", 32, "Spain");
        products[6] = new Wine("Wine 2", 32, "Italy");
        products[7] = new Wine("Wine 3", 144, "Spain");
        products[8] = new Wine("Wine 4", 999, "Ukraine");
        products[9] = new Wine("Wine 5", 45, "Spain");

        Coffee cheapestBestCoffee = null;
        Wine expensiveSpainWine = null;
        for(int i = 0; i < products.length; i++){
            if(products[i] instanceof Coffee){
                Coffee coffee = (Coffee) products[i];
                if(cheapestBestCoffee == null){
                    cheapestBestCoffee = coffee;
                } else if(coffee.getAroma() > cheapestBestCoffee.getAroma()){
                    cheapestBestCoffee = coffee;
                } else if(coffee.getAroma() == cheapestBestCoffee.getAroma() && coffee.getPrice() < cheapestBestCoffee.getPrice())
                {
                    cheapestBestCoffee = coffee;
                }
            } else if(products[i] instanceof Wine){
                Wine wine = (Wine) products[i];
                if(Objects.equals("Spain", wine.getCountry())){
                    if(expensiveSpainWine == null){
                        expensiveSpainWine = wine;
                    } else if(wine.getPrice() > expensiveSpainWine.getPrice()){
                        expensiveSpainWine = wine;
                    }
                }
            }
        }

        if(cheapestBestCoffee != null){
            System.out.println("Cheapest coffee with best aroma: " + cheapestBestCoffee);
        }
        if(expensiveSpainWine != null){
            System.out.println("Most expensive wine from Spain: " + expensiveSpainWine);
        }



        // Homework 7

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 3, 2, 2, 1, 1));

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        if(list1.equals(list2)){
            System.out.println("List 1 and 2 are equals");
        } else {
            HashSet<Integer> set1 = new HashSet<>();
            set1.addAll(list1);
            HashSet<Integer> set2 = new HashSet<>();
            set2.addAll(list2);

            if(set1.equals(set2))
            {
                System.out.println("List 1 and 2 have the same content");
            }
        }

    }
}
