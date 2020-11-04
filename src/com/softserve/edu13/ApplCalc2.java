package com.softserve.edu13;

public class ApplCalc2 {
	public static void main(String[] args) {
		ConsoleUtil.printDouble("sum = ",
				new Calc().add
				(ConsoleUtil.readDouble("a = "),
				ConsoleUtil.readDouble("b = "))
				);
		ConsoleUtil.close();
	}
}
