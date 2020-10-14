package com.softserve.edu.homework6;

public class Square implements Figure{
    private int Perimeter;
    private int sideA;
    private int sideB;

    public Square (int a, int b){
        this.sideA =a;
        this.sideB =b;
    }

    @Override
    public int Perimeter() {
        Perimeter=(sideA + sideB)*2;
        return Perimeter;
    }

    public String toString(){
        return "\nSquare: a="+ sideA +", b="+ sideB;
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
