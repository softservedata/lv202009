package com.softserve.homework6;

public class Rectangle implements Figure {
	private int i;
	private int j;

	public Rectangle(int i, int j) {
		this.i = i;
		this.j = j;
	}

	@Override
	public int perimetr() {
		return (i+j)*2;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Perimetr = " + perimetr();
	}

}
