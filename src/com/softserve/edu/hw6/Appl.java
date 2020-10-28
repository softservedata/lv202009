package com.softserve.edu.hw6;

/*Написати інтерфейс Figure із методом обчислення периметру.
   Написати два класи Rectangle.java та Square, які наслідують та реалізують інтерфейс Figure.
   В методі main класу Appl створити масив, який складається із двох прямокутників та трьох квадратів.
   В циклі вивести периметри фігур. */


//2) Написати класи Сoffee та Wine які є нащадками класу Product з Homework 5.
//        У клас Сoffee додати поле, яке характеризує аромат (значення від 1 до 10).
//        У клас Wine додати поле країни походження.
//        Реалізувати в нащадках методи toString(), equals() та hashCode() з викликом методів батьківського класу.
//        В методі main класу Appl створити масив продуктів, який містить об'єкти Сoffee та Wine.
//        Знайти найдорожче Іспанське вино та найдешевшу найароматнішу каву.

public class Appl {
    public static void main(String[] args) {

        /* ---------------------------------*/
        // Task 1 - Figure
        Figure[] figures = {
                new Rectangle(10.5, 50),
                new Rectangle(12.9, 20),
                new Rectangle(5, 6),
                new Rectangle(10, 2),
                new Square(15),
                new Square(10.5),
                new Square(12.8)
        };

        System.out.println("Task Figures - get perimeters\n");
        for (int i = 0; i < figures.length; i++) {
            System.out.println("Perimeter = " + figures[i].getPerimeter()
                    + " Object = " + figures[i]);
        }


        /*----------------------------------------*/
        // Task 2 - Coffee, Wine
        Product[] products = {
                new Coffee("Fort", 100, 4),
                new Coffee("Lavazza", 120.50, 8),
                new Coffee("Dallmayer", 90, 9),
                new Coffee("Kimbo", 50, 4),
                new Wine(WineCounrty.SPAIN, 350),
                new Wine(WineCounrty.SPAIN, 450),
                new Wine(WineCounrty.UKRAINE, 150),
                new Wine(WineCounrty.FRANCE, 300),
                new Wine(WineCounrty.SPAIN, 310)
        };

        /* -------------------------------------------------------*/
        // Task Coffee - the cheapest aroma coffee

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
                    if (minCoffee.getCoffeeAroma() < currentCoffee.getCoffeeAroma()) {
                        minCoffee = currentCoffee;
                        continue;
                    } else if ((minCoffee.getCoffeeAroma() == currentCoffee.getCoffeeAroma())
                            && (minCoffee.getPrice() > currentCoffee.getPrice())) {
                        minCoffee = currentCoffee;
                    }
                }
            }
            System.out.println("\nTask Coffe - find the cheapest aroma coffee\n");
            System.out.println("Coffee = " + minCoffee + "\n");
        } else {
            System.out.println("Coffee not found\n");
        }


        /* -----------------------------------------------------*/
        // Task - the most expensive spanish wine

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
                    if ((currentWine.getCounrty() == WineCounrty.SPAIN)
                            && (maxWine.getPrice() < currentWine.getPrice())) {
                        maxWine = currentWine;
                    }
                }
            }
            System.out.println("Task Wine - find the most expensive spanish wine\n");
            System.out.println("Wine = " + maxWine+ "\n");
        } else {
            System.out.println("Wine not found\n");
        }
    }

}