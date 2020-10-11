package com.softserve.homework6;

public class Square implements Figure {
    public double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
    @Override
    public String toString() {
        return "Perimeter of this Square = " + calculatePerimeter();
    }
}