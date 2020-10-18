package com.softserve.edu.hw6;


/*Написати інтерфейс Figure із методом обчислення периметру.
   Написати два класи Rectangle та Square, які наслідують та реалізують інтерфейс Figure.
   В методі main класу Appl створити масив, який складається із двох прямокутників та трьох квадратів.
   В циклі вивести периметри фігур. */


//2) Написати класи Сoffee та Wine які є нащадками класу Product з Homework 5.
//        У клас Сoffee додати поле, яке характеризує аромат (значення від 1 до 10).
//        У клас Wine додати поле країни походження.
//        Реалізувати в нащадках методи toString(), equals() та hashCode() з викликом методів батьківського класу.
//        В методі main класу Appl створити масив продуктів, який містить об'єкти Сoffee та Wine.
//        Знайти найдорожче Іспанське вино та найдешевшу найароматнішу каву.

import com.softserve.edu.hw5.ProductUpdate;

public class Appl {
   public static void main(String[] args) {

       // Task 1 - Figure
        Figure[] figure = {
            new Rectangle(10.5, 50),
            new Rectangle(12.9, 20),
            new Square(15),
            new Square(10.5),
            new Square(12.8)
        };


        for (Figure fig : figure) {
            System.out.println(fig.toString());
            System.out.println("Figure's perimeter is equal : " + fig.getPerimeter());
        }
        System.out.println("\n");

        // Task 2 - Coffee, Wine
       ProductUpdate[] productUpdated = {
           new Coffee("Lavazza", 100, 3),
           new Coffee("Kimbo", 120.50, 4),
           new Coffee("Dallmayer", 150, 7),
           new Coffee("Fort", 50, 6),
           new Wine("Sangiovese", 150, "Italy"),
           new Wine("Tempranillo", 100, "Spain"),
           new Wine("Mauro", 200, "Spain")
       };

       // the most expensive spanish wine
       double maxWineSpain = 0;
       String maxWinePriceSpain = "";

       // the cheapest aroma coffee
       double minCoffePrice = 0;
       int maxAromaCoffee = 0;
       String maxAromaCoffeeMinPrice = "";

       // executing
       for (ProductUpdate p : productUpdated){
           p.toString();

           // Wine
           if(p instanceof Wine){
               if(((Wine) p).getWineCountry().equals("Spain")){
                   if (((Wine) p).getWinePrice()>maxWineSpain){
                       maxWineSpain=((Wine) p).getWinePrice();
                       maxWinePriceSpain= ((Wine) p).getWineName();
                   }
               }
           }

           // Coffee
           else if (p instanceof Coffee){
               if (((Coffee) p).getAroma() > maxAromaCoffee || ((Coffee) p).getAroma()==maxAromaCoffee){
                   maxAromaCoffee=((Coffee) p).getAroma();
                   if (((Coffee) p).getCoffeePrice() < minCoffePrice){
                       minCoffePrice=((Coffee) p).getCoffeePrice();
                       maxAromaCoffeeMinPrice= ((Coffee) p).getCoffeeName();
                   }
               }
           }
       }
       System.out.println("\nThe most expensive spanish wine is "+maxWinePriceSpain+" - with price "+maxWineSpain + "UAH");
       System.out.println("The cheapest aroma coffee is " + maxAromaCoffeeMinPrice+ " - with price " +minCoffePrice + "UAH");
   }

    }