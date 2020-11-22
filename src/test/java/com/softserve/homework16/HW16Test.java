package com.softserve.homework16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW16Test {
    private WebDriver driver;
    private Wait<WebDriver> wait;
    private By searchField=By.xpath("//div[@id='search']/input");
    private By searchButton=By.xpath("//button[@class='btn btn-default btn-lg']");
    private By searchResults=By.xpath("//div[@class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']");

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
    public void testSearchProducts() {
        driver.findElement(searchField).click();
        driver.findElement(searchField).sendKeys("mac");
        driver.findElement(searchButton).click();

        List<WebElement> searchResultProducts=driver.findElements(searchResults);
        boolean isProductFound=false;
        for (WebElement d: searchResultProducts) {
            if(d.getText().trim().toLowerCase().contains("macbook pro"))
                isProductFound=true;
        }
        Assert.assertTrue(isProductFound, "product was not found");
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
    Ввести у поле Search текст для пошуку "mac".
    Клікнути на кнопку пошуку.
    Перевірити, чи на сторінці присутній товар "MacBook Pro"
    Запушати код на github у свою вітку.

*/