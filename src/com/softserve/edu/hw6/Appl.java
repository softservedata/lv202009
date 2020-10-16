package com.softserve.edu.hw6;


/*Написати інтерфейс Figure із методом обчислення периметру.
   Написати два класи Rectangle та Square, які наслідують та реалізують інтерфейс Figure.
   В методі main класу Appl створити масив, який складається із двох прямокутників та трьох квадратів.
   В циклі вивести периметри фігур. */


public class Appl {
    private double length;
    private double width;

    // 1 constructor - ініціалізує поля,  назва = класс; нічого не повертає
    public Appl() {
        length = 0;
        width = 0;
    }

    // constructor specified
    public Appl(String name, double length, double width) {
        this.length = length;
        this.width = width;
    }

    public static void main(String[] args) {
        Figure[] figure = {
                new Rectangle(10.5, 50);
        new Rectangle(12.9, 20);
        new Square(15);
        new Square(10.5);
        new Square(12.8);
        }


        for (Figure fig : figure) {
            System.out.println(fig.toString());
            System.out.println("Figure's perimeter is equal : " + fig.getPerimeter();
        }
        System.out.println("\n");
    }
}