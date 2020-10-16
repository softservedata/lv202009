package com.softserve.edu.hw6;


/*Homework 6 (from 08.10.2020)
1) Написати інтерфейс Figure із методом обчислення периметру.
   Написати два класи Rectangle та Square, які наслідують та реалізують інтерфейс Figure.
   В методі main класу Appl створити масив, який складається із двох прямокутників та трьох квадратів.
   В циклі вивести периметри фігур.
*/


public interface Figure {
    public double getPerimeter();
}