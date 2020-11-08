package com.softserve.edu.homework6;

public class Rectangle implements Figure {

    private int Perimeter;
    private int sideA;
    private int sideB;

    public Rectangle(int a, int b){
        this.setSideA(a);
        this.setSideB(b);
    }

    @Override
    public int Perimeter() {
        Perimeter=(sideA + sideB)*2;

        return Perimeter;
    }

    public String toString(){
        return "\nRectangle: a="+ sideA +", b="+ sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
}
