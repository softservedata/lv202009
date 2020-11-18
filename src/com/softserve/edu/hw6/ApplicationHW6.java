package com.softserve.edu.hw6;

import com.softserve.edu.hw5.Product;

public class ApplicationHW6 {
	public static void main(String[] args) {

		Product[] p = { new Wine(WineCountry.UKRAINE, 120), 
				new Wine(WineCountry.FRANCE, 120),
				new Wine(WineCountry.SPAIN, 130), 
				//new Wine(WineCountry.SPAIN, 132), 
				new Coffee(4, 80),
				new Coffee(5, 90), 
				new Coffee(3, 85), 
				new Coffee(5, 84), 
				new Wine(WineCountry.FRANCE, 300) };

		//find coffee
		Product startCoffee = null;
		for (int i = 0; i < p.length; i++) {
			if (p[i] instanceof Coffee) {
				startCoffee = p[i];
				break;
			}
		}
		if ((startCoffee != null) && (startCoffee instanceof Coffee)) {
			Coffee minCoffee = (Coffee) startCoffee;
			for (int i = 0; i < p.length; i++) {
				if (p[i] instanceof Coffee) {
					Coffee currentCoffee = (Coffee) p[i];
					if (minCoffee.getAroma() < currentCoffee.getAroma()) {
						minCoffee = currentCoffee;
						continue;
					} else if ((minCoffee.getAroma() == currentCoffee.getAroma())
							&& (minCoffee.getPrice() > currentCoffee.getPrice())) {
						minCoffee = currentCoffee;
					}
				}

			}
			System.out.println("Cheapest best Coffee " + minCoffee);
		} else {
			System.out.println("Coffee not found");
		}
//find wine
		Product startWine = null;
		for (int i = 0; i < p.length; i++) {
			if (p[i] instanceof Wine) {
				startWine = p[i];
				break;
			}
		}

		if ((startWine != null) && (startWine instanceof Wine)) {
			Wine maxWine = (Wine) startWine;
			for (int i = 0; i < p.length; i++) {
				if (p[i] instanceof Wine) {
					Wine currentWine = (Wine) p[i];
					if ((currentWine.getCountry() == WineCountry.SPAIN)
							&& (maxWine.getPrice() < currentWine.getPrice())) {
						maxWine = currentWine;

					}
				}

			}
			System.out.println("Most expansive spanish Wine " + maxWine);
		} else {
			System.out.println("Wine not found");
		}

	}

}
