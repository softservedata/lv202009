package com.softserve.edu16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//NOT FINISHED
public class SearchTest {
	private final String BASE_URL = "http://taqc-opencart.epizy.com/";
	private final Long IMPLICITLY_WAIT_SECONDS = 10L;
	private final Long ONE_SECOND_DELAY = 1000L;
	private WebDriver driver;

	// Overload
	private void presentationSleep() {
		presentationSleep(1);
	}

	// Overload
	private void presentationSleep(int seconds) {
		try {
			Thread.sleep(seconds * ONE_SECOND_DELAY);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testWedDriver() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://taqc-opencart.epizy.com/");
		System.out.println("0. Page title is: " + driver.getTitle());

		driver.findElement(By.xpath("//i[@class='fa fa-caret-down']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("GBP")).click();

		
		// driver.close();
		driver.quit();
	}

}