package com.softserve.homework17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW17Test {
    private WebDriver driver;
    private Wait<WebDriver> wait;
    private By myAccountDropDown=By.cssSelector("li.dropdown span.hidden-xs.hidden-sm.hidden-md");
    private By loginButtonDropDown=By.cssSelector("div#top-links ul.dropdown-menu.dropdown-menu-right");
    private By loginButton=By.cssSelector("input[value='Login']");
    private By emailField=By.cssSelector("input#input-email");

    @BeforeClass
    public void beforeClass()  {
        System.setProperty("webdriver.chrome.driver","./lib/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);

        driver.manage().deleteAllCookies();
        driver.get("http://taqc-opencart.epizy.com/");
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
   Пошук web елементів виконувати виключно за допомогою CSS.
   Клікнути на My Account.
   Далі клікнути на Login.
   Перевірити, чи browser перейшов на сторінку логування.
Запушати код на github у свою вітку.


*/