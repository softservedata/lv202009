package com.softserve.edu.hw6;

public class Square implements Figure {
	private int a;

	public Square(int a) {

		this.a = a;

	}

	@Override
	public int getArea() {
		return 4 * a;
	}

	public String toString() {

		return "perimeter of a Square " + getArea(); // why I can't put here just return getArea(); ????
	}
}
