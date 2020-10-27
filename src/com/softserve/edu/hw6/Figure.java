package com.softserve.edu.hw6;


/*Homework 6 (from 08.10.2020)
1) Написати інтерфейс Figure із методом обчислення периметру.
   Написати два класи Rectangle.java та Square, які наслідують та реалізують інтерфейс Figure.
   В методі main класу Appl створити масив, який складається із двох прямокутників та трьох квадратів.
   В циклі вивести периметри фігур.
*/


public interface Figure {
    double getPerimeter();

    Figure[] figure = {
            //new Rectangle.java(10.5, 50),
            //new Rectangle.java(12.9, 20),
            new Square(15),
            new Square(10.5),
            new Square(12.8)
    };

/*
        for (Figure fig : figure) {
        System.out.println(fig.toString());
        System.out.println("Figure's perimeter is equal : " + fig.getPerimeter());
    }
        System.out.println("\n");
        */

}