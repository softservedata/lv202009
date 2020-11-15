package com.softserve.hw14;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmployeeTest {
	private Employee employee;

	@BeforeClass
	public void beforeClass() {
		employee = new Employee();
	}
	
	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
			
			new Object[] {123, "Ivan" , "ivan@gmail.com"},
			new Object[] {124, "Petro"},
			new Object[] {125, "Zahar", "zahar@gmail.com"},
			new Object[] {126, "Olga" , "olga@gmail.com"},
			new Object[] {127, "Mila"},
			new Object[] {128, "Natan"},
			new Object[] {129, "Iren" , "iren@gmail.com"},

			};
	}

	@Test(dataProvider = "dp")
	public void f(String n, String s, String e) {
		 Assert.assertEquals(employee.getName(),s);
	}

}
