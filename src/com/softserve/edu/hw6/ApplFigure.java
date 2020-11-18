package com.softserve.edu.hw6;

public class ApplFigure {

	public static void main(String[] args) {
		String wine = null;
		Figure[] f = { new Rectangle(3, 5), new Rectangle(4, 2), new Square(3), new Square(2), new Square(13) };

//printout perimeters of array elements
		for (int i = 0; i <= f.length - 1; i++) {
			System.out.println(f[i].toString());
		}

//		Wine [] p = { new Wine("w1", 120, "Spain"), new Wine("w2", 120, "Georgia"), new Wine("w3", 130, "Spain"),
//				new Wine("w4", 132, "Spain") }; // can't give it Product type - then getCountry doesn't work
//		int max = 0;
//
//		for (int k = 0; k <= p.length - 1; k++) {
//			{
//				String b = p[k].getCountry();
//				if (b == "Spain") {
//					System.out.println("\n Spain wine was found");
//					System.out.println(p[k].toString());
//
//					for (int j = 0; j <= p.length - 1; j++) {
//						int imax = 0;
//						if (p[j].getPrice() > max) {
//							max = p[j].getPrice();
//							wine = p[j].getName();
//							imax = j + 1;
//
//						}
//
//					}
//
//				}
//			}
//
//		}
//
//		System.out.println("\n The most expencive Spanish wine is " + wine + " with price " + max);
	}
}
