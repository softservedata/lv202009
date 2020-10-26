package com.softserve.hw06;

public class Rectangle implements Figure {
    private double width;
    private double height;

    public Rectangle() {
        width = 0;
        height = 0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle [width = " + width + ", height = " + height + "]";
    }

    // TODO hashCode(); equals(); compareTo()
}
