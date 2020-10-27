package com.softserve.edu.hw6;


/*Написати інтерфейс Figure із методом обчислення периметру.
   Написати два класи Rectangle.java та Square, які наслідують та реалізують інтерфейс Figure.
   В методі main класу Appl створити масив, який складається із двох прямокутників та трьох квадратів.
   В циклі вивести периметри фігур. */

import java.util.Objects;

public class Square implements Figure{
    private Rectangle rectangle;

    // Default Constructor
    public Square(double width) {
        rectangle = new Rectangle(width, width);
       }

    public double getWidth() {
        return rectangle.getWidth();
    }

    @Override
    public String toString() {
        return "Square{ " +
                "width= " + getWidth() +
                '}';
    }

    // використовуємо існуючий функціонал, той, що для прямокутника
    @Override
    public double getPerimeter() {
        return rectangle.getPerimeter();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Objects.equals(rectangle, square.rectangle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rectangle);
    }


    // To do: compareTo()

}
