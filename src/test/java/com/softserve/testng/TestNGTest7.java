package test.java.com.softserve.testng;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Vector;

public class TestNGTest7 {

	@DataProvider(name = "Data-Provider-Function")
	public Object[][] parameterIntTestProvider() {
		return new Object[][] {
				{ Vector.class, new String[] { "java.util.AbstractList", "java.util.AbstractCollection" } },
				{ String.class, new String[] { "1", "2" } },
				{ Integer.class, new String[] { "3", "4", "5" } }
		};
	}

	@Test(dataProvider = "Data-Provider-Function")
	public void parameterIntTest(Class<?> clzz, String[] numbers) {
		System.out.println("Class is: " + clzz.getName());
		for (String num : numbers) {
			System.out.println("\tParameterized Number is: " + num);
		}
	}

}
