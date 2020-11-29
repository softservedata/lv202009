package com.softserve.edu.hw18;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjaxTest {

	private final String BASE_URL = "https://www.w3schools.com/js/js_ajax_intro.asp";
	private final Long IMPLICITLY_WAIT_SECONDS = 10L;
	private final Long ONE_SECOND_DELAY = 1000L;
	private WebDriver driver;

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

	@BeforeSuite
	public void beforeSuite() {
		WebDriverManager.chromedriver().setup();
	}

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT_SECONDS, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		presentationSleep();
		driver.quit();
	}

	@BeforeMethod
	public void beforeMethod() {
		driver.get(BASE_URL);
		presentationSleep();
	}

	@AfterMethod
	public void afterMethod() {
		presentationSleep(); // For Presentation ONLY

	}

	@Test
	public void AjaxIframePage() {

		WebElement position = driver.findElement(By.xpath("//div[@id='demo']/h2"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", position);

		WebElement changeText = driver.findElement(By.cssSelector("button[onclick='loadDoc()']"));
		changeText.click();
		// wait until element disappears and find new text
		if ((new WebDriverWait(driver, 10)).until(ExpectedConditions.stalenessOf(position))) {
			(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='demo']/p[2]")));
		}

	}
	
}
