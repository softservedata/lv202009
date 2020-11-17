package com.softserve.hw15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Currency {
	@Test
    public void testWedDriver() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Thread.sleep(1000); // For Presentation Only
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://taqc-opencart.epizy.com/");
        
        WebElement element = driver.findElement(By.xpath("//i[@class='fa fa-caret-down']"));
        element.click();
        driver.findElement(By.xpath("//ul[@class='dropdown-menu']//button[text()='£ Pound Sterling']")).click();
        WebElement current = driver.findElement(By.xpath("//div[@class='btn-group']//strong[text()='£']"));
        Assert.assertEquals(current.getText(), "£");
        
        //Thread.sleep(2000); // For Presentation Only
        driver.quit();
    }

}
