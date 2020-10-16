package com.softserve.edu.hw6;


//Написати інтерфейс Figure із методом обчислення периметру.
//        Написати два класи Rectangle та Square, які наслідують та реалізують інтерфейс Figure.
//        В методі main класу Appl створити масив, який складається із двох прямокутників та трьох квадратів.
//        В циклі вивести периметри фігур.

public class Rectangle implements Figure {
        private static double length;
        private static double width;


        // Default Constructor
        public Rectangle () {
            length=0.0;
            width=0.0;
        }

        // spec Constructor
        public Rectangle (double length, double width) {
            this.setLength(length);
            this.setWidth(width);
        }

//        @Override
//        public double getPerimeter() {
//            getPerimeter = (length*2 + width*2);
//            return getPerimeter;
//        }

        public static void setLength(double length) {
            Rectangle.length = length;
        }

        public static void setWidth(double width) {
            Rectangle.width = width;
        }

        public static double getLength() {
            return length;
        }

        public static double getWidth() {
            return width;
        }

        public double getPerimeter() {
                return length*2 + width*2;
            }

        }