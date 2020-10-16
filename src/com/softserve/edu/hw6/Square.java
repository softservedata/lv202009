package com.softserve.edu.hw6;


/*Написати інтерфейс Figure із методом обчислення периметру.
   Написати два класи Rectangle та Square, які наслідують та реалізують інтерфейс Figure.
   В методі main класу Appl створити масив, який складається із двох прямокутників та трьох квадратів.
   В циклі вивести периметри фігур. */
public class Square implements Figure{

    private static double width;

    // Default Constructor
    public Square() {
        width=0.0;
       }

    // spec Constructor
    public Square(double width) {
        this.width = width;
       }

    public static double getWidth() {
        return width;
    }

    public static void setWidth(double width) {
        Square.width = width;
    }

    public double getPerimeter() {
        return width*4;
    }
}
