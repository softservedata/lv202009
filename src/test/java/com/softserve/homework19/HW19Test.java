package com.softserve.homework19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class HW19Test {

    private WebDriver driver;
    private ChromeOptions options;
    private By myAccountDropDown=By.cssSelector("li.dropdown span.hidden-xs.hidden-sm.hidden-md");
    private By loginButtonDropDown=By.cssSelector("div#top-links ul.dropdown-menu.dropdown-menu-right");
    private By loginButton=By.cssSelector("input[value='Login']");
    private By emailField=By.cssSelector("input#input-email");

    @BeforeClass
    public void beforeClass() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./lib/chromedriver.exe");
        options = new ChromeOptions();
        options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
        driver.manage().deleteAllCookies();
        System.out.println("Headless run");
        driver.get("http://taqc-opencart.epizy.com/");
        Thread.sleep(3000);
    }


    @BeforeMethod
    public void setUp() {

    }

    @Test
    public void testSearchProducts() throws InterruptedException {
        driver.findElement(myAccountDropDown).click();
        driver.findElement(loginButtonDropDown).click();
        Assert.assertTrue(driver.findElement(loginButton).isDisplayed());
        Assert.assertTrue(driver.findElement(emailField).isEnabled());
        Assert.assertEquals(driver.findElement(loginButton).getAttribute("value"), "Login");
        System.out.println("Headless finish");
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
   Homework 19 (from 30.11.2020)
   1) Зайти на сайт http://taqc-opencart.epizy.com/
   Пошук web елементів виконувати виключно за допомогою XPath.
   Клікнути на My Account.
   Далі клікнути на Login.
   Перевірити, чи browser перейшов на сторінку логування.
   ChromeDriver запускати у headless режимі.
   Запушати код на github у свою вітку.


*/