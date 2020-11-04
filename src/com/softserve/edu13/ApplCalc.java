package com.softserve.edu13;

public class ApplCalc {
	public static void main(String[] args) {
		Calc calc = new Calc();
		double a = ConsoleUtil.readDouble("a = ");
		double b = ConsoleUtil.readDouble("b = ");
		ConsoleUtil.printDouble("sum = ", calc.add(a, b));
		ConsoleUtil.printDouble("div = ", calc.div(a, b));
		ConsoleUtil.close();
	}
}