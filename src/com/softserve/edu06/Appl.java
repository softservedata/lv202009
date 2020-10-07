package com.softserve.edu06;

/*-
enum Season {
    WINTER, SPRING, SUMMER, AUTUMN
}
*/

// /*-
enum Season {
	WINTER("Winter"), SPRING("Spring"), SUMMER("Summer"), AUTUMN("Autumn");

	private String name;

	private Season(String name) {
		this.name = name;
	}

	public Season nextSeason() {
		if (this == Season.WINTER) {
			return Season.SPRING;
		}
		if (this == Season.SPRING) {
			return Season.SUMMER;
		}
		if (this == Season.SUMMER) {
			return Season.AUTUMN;
		}
		return Season.WINTER;
	}

	@Override
	public String toString() {
		return name;
	}
}
// */

public class Appl {
	public static void main(String[] args) {
		/*-
		Season season;
		season = Season.WINTER;
		System.out.println("season = " + season.name());
		//
		//String name = "Winter1"; // Runtime Error
		String name = "Summer";
		season = Season.valueOf(name.toUpperCase());
		System.out.println("season = " + season.name());
		//
		for (Season current : Season.values()) {
		    System.out.println("current = " + current); // current.toString()
		 }
		 */
		// /*-
		Season season = Season.WINTER;
		String month = "Marth";
		switch (month) {
		case "Deñember":
		case "January":
		case "February":
			season = Season.WINTER;
			break;
		case "Marth":
		case "April":
		case "May":
			season = Season.SPRING;
			break;
		case "June":
		case "Jule":
		case "August":
			season = Season.SUMMER;
			break;
		case "September":
		case "October":
		case "November":
			season = Season.AUTUMN;
			break;
		default:
			System.out.println("No this month");
			System.exit(0);
		}
		System.out.println("season = " + season);
		//
		Season nextSeason = season.nextSeason();
		System.out.println("Next season = " + season.nextSeason());
		//
		switch (nextSeason) {
		case WINTER:
			System.out.println("Deñember, January, February");
			break;
		case SPRING:
			System.out.println("Marth, April, May");
			break;
		case SUMMER:
			System.out.println("June, Jule, August");
			break;
		case AUTUMN:
			System.out.println("September, October, November");
			break;
		}
		// */
	}
}
