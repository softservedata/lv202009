package com.softserve.homework6;

public class Square implements Figure {
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int calculatePerimeter() {
        return sideLength * 4;
    }

    @Override
    public String toString() {
        return "Square{" + "sideLength=" + sideLength + '}';
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }
}
