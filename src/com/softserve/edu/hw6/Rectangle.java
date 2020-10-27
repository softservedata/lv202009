package com.softserve.edu.hw6;


//Написати інтерфейс Figure із методом обчислення периметру.
//        Написати два класи Rectangle та Square, які наслідують та реалізують інтерфейс Figure.
//        В методі main класу Appl створити масив, який складається із двох прямокутників та трьох квадратів.
//        В циклі вивести периметри фігур.

public class Rectangle implements Figure {
        private double width;
        private double height;

        // Default Constructor
        public Rectangle () {
            width=0.0;
            height=0.0;
        }

        // spec Constructor
        public Rectangle (double width, double height) {
            this.width = width;
            this.height = height;
        }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width= " + width +
                ", height= " + height +
                '}';
    }

}