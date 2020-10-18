package com.softserve.edu.hw6;

public class Rectangle implements Figure {

	private int length, width;

	public Rectangle(int length, int width) {

		this.length = length;

		this.width = width;

	}

	@Override
	public int getArea() {
		return 2 * (length + width);
	}


	public String toString() {
	return "perimeter of a Rectangle " + getArea();
			}
	
	
}
