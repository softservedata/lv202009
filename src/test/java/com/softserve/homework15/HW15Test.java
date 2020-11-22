package com.softserve.homework15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class HW15Test {
    private WebDriver driver;
    private Wait<WebDriver> wait;
    private By currency=By.xpath("//div[@class='btn-group']");
    private By sterlingCurrency=By.xpath("//button[@name='GBP']");
    private By sterlingSign=By.xpath("//button[@class='btn btn-link dropdown-toggle']/strong");

    @BeforeClass
    public void beforeClass()  {
        System.setProperty("webdriver.chrome.driver","./lib/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        wait = new WebDriverWait(driver, 7).withMessage("Element was not found");
        driver.manage().deleteAllCookies();
        driver.get("http://taqc-opencart.epizy.com/");
    }


    @BeforeMethod
    public void setUp() {

    }

    @Test
    public void testChangingCurrency() {
        driver.findElement(currency).click();
        driver.findElement(sterlingCurrency).click();
        Assert.assertEquals(driver.findElement(sterlingSign).getText(),"£");
    }

    @AfterMethod
    public void tearDown() {

    }
    @AfterClass
    public void afterClass() {
        driver.close();
        driver.quit();
    }
}

/*
        Зайти на сайт http://taqc-opencart.epizy.com/
        Клікнути на вибір валюти  Currency
        Вибрати PoundSterling
        Перевірити, чи на сторінці змінилася грошова одиниця
        Запушати код на github у свою вітку.
*/