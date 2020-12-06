package com.softserve.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.softserve.opencart.data.Currencies;
import com.softserve.opencart.pages.HomePage;

public class CurrencyTest extends OpencartTestRunner {

    @DataProvider(parallel = true)
    public Object[][] validCurrency() {
        return new Object[][] {
                { Currencies.POUND_STERLING },
                { Currencies.EURO },
                { Currencies.US_DOLLAR },
        };
    }
	@Test(dataProvider = "validCurrency")
	public void checkChangeCurrency(Currencies currency) throws InterruptedException {
	    presentationSleep(2); // For Presentation ONLY
		// Steps
		HomePage homepage = loadApplication().chooseCurrency(currency);
		presentationSleep(2); // For Presentation ONLY
		//
		// Check
		System.out.println("Actual: " + homepage.getCurrencyText());
		System.out.println("Expected: " + currency.toString());
		Assert.assertTrue(currency.toString().contains(homepage.getCurrencyText()));
		presentationSleep(2); // For Presentation ONLY
	}
}



/* Homework 20:

   Зайти на сайт http://taqc-opencart.epizy.com/
   Скопіювати у свою вітку з вітки selenium (https://github.com/softservedata/lv202009/tree/selenium) файли з пакетів com.softserve.opencart.*
   Знайти спосіб перевірки вибору валюти у класі CurrencyTest.java (package com.softserve.opencart.tests).
   Поправити та розкоментувати стрічку
   // Assert.assertTrue(homepage.getCurrencyText().contains(currency.toString()));
   Запушати код на github у свою вітку.
 */
