package com.softserve.hw06;

public class ApplFigure {
    public static void main(String[] args) {
        Figure[] figures = { new Rectangle(5, 6),
                new Rectangle(6, 5),
                new Square(5),
                new Square(6),
                new Rectangle(10, 2),
                new Square(4) };
        //
        for (int i = 0; i < figures.length; i++) {
            System.out.println("Perimeter = " + figures[i].getPerimeter() 
                    + "  Object = " + figures[i].toString());
        }
    }

}
