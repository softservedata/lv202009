package com.softserve.homework6;

public class Rectangle implements Figure {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public int calculatePerimeter() {
        return height * 2 + width * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "height=" + height + ", width=" + width + '}';
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
