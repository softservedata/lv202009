package com.softserve.homework6;

public class Rectangle implements Figure {
    public double length;
    public double width;

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Perimeter of this Rectangle = " + calculatePerimeter();
    }
}
