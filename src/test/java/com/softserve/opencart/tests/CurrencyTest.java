package com.softserve.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.softserve.opencart.data.Currencies;
import com.softserve.opencart.pages.HomePage;

public class CurrencyTest extends OpencartTestRunner {

    @DataProvider//(parallel = true)
    public Object[][] validCurrency() {
        return new Object[][] {
                { Currencies.POUND_STERLING },
//                { Currencies.EURO },
//                { Currencies.US_DOLLAR },
        };
    }
	@Test(dataProvider = "validCurrency")
	public void checkChangeCurrency(Currencies currency) {
	    //System.out.println("checkChangeCurrency(): Thread id = " + Thread.currentThread().getId());
	    presentationSleep(2); // For Presentation ONLY
		// Steps
		HomePage homepage = loadApplication()
				.chooseCurrency(currency);
		presentationSleep(); // For Presentation ONLY
		//
		// Check
		//System.out.println("Actual: " + homepage.getCurrencyText());
		//System.out.println("Expected: " + currencySymbol);
		Assert.assertTrue(homepage.getCurrencyText().contains(currency.GetSymbol()));
		presentationSleep(2); // For Presentation ONLY
	}
}
