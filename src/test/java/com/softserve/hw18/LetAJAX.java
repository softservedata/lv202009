package com.softserve.hw18;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetAJAX {

	private final String BASE_URL = "https://www.w3schools.com/js/js_ajax_intro.asp";
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
	
	private void closePopup() {
		presentationSleep(); // For Presentation ONLY
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> foooterButton = driver.findElements(By.xpath("//footer[contains(@class,'cookie')]//button"));
		// System.out.println("***foooterButton.size() = " + foooterButton.size());
		if (foooterButton.size() > 0) {
			foooterButton.get(0).click();
			presentationSleep(); // For Presentation ONLY
		}
		driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT_SECONDS, TimeUnit.SECONDS);
	}
	

	@Test
	public void AJAXWebElement() {
		
		//Find "Let AJAX change this text" element
		driver.findElement(By.xpath("//div[@id='demo']/h2[text()='Let AJAX change this text']"));
		
		//Click on "Change Content" btn
		driver.findElement(By.xpath("//button[text()='Change Content']")).click();
		
		// Turn off Implicit Wait
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		//Wait until "Let AJAX change this text" disappeared
		(new WebDriverWait(driver, 10))
		.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='demo']/h2[text()='Let AJAX change this text']")));
		
		// Turn on Implicit Wait
		driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT_SECONDS, TimeUnit.SECONDS);
		
		//Check if "AJAX is a technique for accessing web servers from a web page." element present
		WebElement newajax = driver.findElement(By.xpath("//div[@id='demo']//p[text()='AJAX is a technique for accessing web servers from a web page.']"));
		Assert.assertTrue(newajax.getText().contains("AJAX is a technique for accessing web servers from a web page."));
		Assert.assertEquals(newajax.getText(), "AJAX is a technique for accessing web servers from a web page.");
	}

	
}
