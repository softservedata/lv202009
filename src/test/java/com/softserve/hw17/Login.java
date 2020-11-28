package com.softserve.hw17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

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
			Thread.sleep(seconds * ONE_SECOND_DELAY); // For Presentation ONLY
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@BeforeSuite
	public void beforeSuite() {
		WebDriverManager.chromedriver().setup();
		// WebDriverManager.firefoxdriver().setup();
	}

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT_SECONDS, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		presentationSleep(); // For Presentation ONLY
		// driver.close();
		driver.quit();
	}

	@BeforeMethod
	public void beforeMethod() {
		driver.get(BASE_URL);
		presentationSleep(); // For Presentation ONLY
	}

	@AfterMethod
	public void afterMethod() {
		presentationSleep(); // For Presentation ONLY
		// logout; clear cache; delete cookie; delete session;
		// Save Screen;
	}

	@Test
	public void checkLoginPage() throws InterruptedException {
		
		
		//Click on My Account
		driver.findElement(By.cssSelector("i.fa.fa-user")).click();
		
		//Click on Login
		driver.findElement(By.cssSelector("#top-links > ul > li.dropdown.open > ul li>a[href*='route=account/login']")).click();


		//Check if is is a Login page
		WebElement name = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		//Assert.assertEquals(driver.findElement(By.partialLinkText("MacBook Pro")).getText(), "MacBook Pro");

		Assert.assertEquals(name.getTagName(), "input");
		//Thread.sleep(10000);
	}

}
