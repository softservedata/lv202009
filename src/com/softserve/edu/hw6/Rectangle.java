package com.softserve.edu.hw6;

public class Rectangle implements Figure{
    double sideA;
    double sideB;
    double perimeter;

    public Rectangle(){
        sideA = 0.0;
        sideB = 0.0;
    }

    public Rectangle(double sideA,double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double perimeter() {
        return perimeter = 2 * (sideA + sideB);
    }
}
