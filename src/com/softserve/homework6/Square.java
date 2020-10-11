package com.softserve.homework6;

public class Square implements Figure {
	private int i;
	private int j;

	public Square(int i, int j) {
		this.i = i;
		this.j = j;
	}

	@Override
	public int perimetr() {
		// TODO Auto-generated method stub
		return (i+j)*2;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Perimetr = " + perimetr();
	}

}
