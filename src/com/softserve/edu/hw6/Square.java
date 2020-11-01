package com.softserve.edu.hw6;

public class Square implements Figure {
    private Rectangle rectangle;
    
    public Square(double width) {
        rectangle = new Rectangle(width, width);
    }
    
    public double getWidth() {
        return rectangle.getWidth();
    }
    
    @Override
    public double getPerimeter() {
        return rectangle.getPerimeter();
    }
    
    @Override
    public String toString() {
        return "Square [width = " + getWidth() + "]";
    }
}
