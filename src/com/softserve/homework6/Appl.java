package com.softserve.homework6;

public class Appl {

	public static void main(String[] args) {

		Figure[] figure = { new Rectangle(7, 3), new Rectangle(11, 4), new Square(7, 7), new Square(2, 2),
				new Square(5, 5) };

		for (Figure fig : figure) {
			System.out.println(fig.toString());
		}

		Wine[] wine = { new Wine("Merlot", 165, "France"), new Wine("Chardonnay", 270, "France"),
				new Wine("White Zinfandel", 205, "The USA"), new Wine("Pinot Grigio", 178, "Italy"),
				new Wine("Cabarnet Sauvignon", 651, "Chily"), new Wine("Pinot Noir", 243, "France"),
				new Wine("Riesling", 198, "Germany") };

		for (int k = 0; k < 6; k++) {
			System.out.println("Wine parameters = " + wine[k].toString());
		}

		Coffee[] coffee = { new Coffee("Coffee beans", 200, 1), new Coffee("Instant coffee", 40, 2),
				new Coffee("Coffee beans", 250, 3), new Coffee("Coffee beans", 185, 4),
				new Coffee("Ground coffee", 76, 5), new Coffee("Ground coffee", 90, 6),
				new Coffee("Instant coffee", 55, 7) };

		for (Coffee cof : coffee) {
			System.out.println(cof.toString());
		}

	}

}
