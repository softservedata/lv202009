package com.softserve.edu.hw6;

public class Square implements Figure{
    double sideC;
    double perimeter;

    public Square(){
        sideC = 0.0;
    }

    public Square(double sideC){
        this.sideC = sideC;
    }

    public double perimeter(){
        return perimeter = 4*sideC;
    }
}