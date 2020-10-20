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

import com.softserve.edu.hw5.ProductUpd;

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
       ProductUpd[] productUpdated = {
               new Coffee("Lavazza", 100, 4),
               new Coffee("Kimbo", 120.50, 4),
               new Coffee("Dallmayer", 150, 7),
               new Coffee("Fort", 50, 3),
               new Wine("Sangiovese", 350, "Italy"),
               new Wine("Tempranillo", 300, "Spain"),
               new Wine("Mauro", 310, "Spain")
       };

       // the most expensive spanish wine
       Wine maxExpensiveSpainWine = new Wine("",0,"");

       // the cheapest aroma coffee
       Coffee maxAromaCoffeeWithMinPrice = new Coffee("",0,0);

       // executing
       for (ProductUpd p : productUpdated){
           // Wine
           if(p instanceof Wine){
               if(((Wine) p).getWineCountry().equals("Spain")){
                   if (((Wine) p).getPrice()>maxExpensiveSpainWine.getPrice()){
                       maxExpensiveSpainWine = (Wine) p;
                   }
               }
           }

           // Coffee
           else if (p instanceof Coffee){
               if (((Coffee) p).getAroma() >= maxAromaCoffeeWithMinPrice.getAroma()){
                   if (((Coffee) p).getCoffeePrice() < maxAromaCoffeeWithMinPrice.getCoffeePrice()){
                       maxAromaCoffeeWithMinPrice = (Coffee)p;
                   }
               }
           }
       }

       System.out.println("\nThe most expensive spanish wine is "+ maxExpensiveSpainWine.toString());
       System.out.println("The cheapest aroma coffee is " + maxAromaCoffeeWithMinPrice.toString());
   }}