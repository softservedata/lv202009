package com.softserve.hw19;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.service.DriverService;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginCrBr {

	private final String BASE_URL = "http://taqc-opencart.epizy.com/";
	private final Long IMPLICITLY_WAIT_SECONDS = 15L;
	private final Long ONE_SECOND_DELAY = 1000L;
	
	private final String TIME_TEMPLATE = "yyyy-MM-dd_HH-mm-ss-S";
	public static DriverService service;

	// Overload
	private void presentationSleep() {
		presentationSleep(1);
	}

	// Overload
	private void presentationSleep(int seconds) {
		try {
			Thread.sleep(seconds * ONE_SECOND_DELAY); // For Presentation ONLY
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Test
	public void checkLoginPage() throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();       
        options.addArguments("-console");
        options.addArguments("--headless"); // Without UI
        WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT_SECONDS, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(BASE_URL);
		presentationSleep();

		// Click on My Account
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul//i[@class='fa fa-user']")).click();

		// Click on Login
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//li/a[contains(text(),'Login')]"))
				.click();

		// Check if it is a Login page
		WebElement name = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
		Assert.assertEquals(name.getTagName(), "input");
		
		String currentTime = new SimpleDateFormat(TIME_TEMPLATE).format(new Date());
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("./" + currentTime + "_screenshot.png"));
		
		driver.quit();

	}

}
