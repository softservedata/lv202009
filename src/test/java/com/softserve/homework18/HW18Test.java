package com.softserve.homework18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class HW18Test {
    private WebDriver driver;
    private Wait<WebDriver> wait;
    private By ajaxLabelFirst=By.cssSelector("div#demo h2");
    private By expectedContent=By.cssSelector("div#demo h1+p+p");
    private By changeContentButton=By.cssSelector("div#demo button[type='button']");
    private String content;


    @BeforeClass
    public void beforeClass()  {
        System.setProperty("webdriver.chrome.driver","./lib/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //wait = new WebDriverWait(driver, 30).withMessage("Element was not found");
        driver.manage().deleteAllCookies();
        driver.get("https://www.w3schools.com/js/js_ajax_intro.asp");
    }


    @BeforeMethod
    public void setUp() {

    }

    @Test
    public void testSearchProducts() throws InterruptedException {
        content=driver.findElement(ajaxLabelFirst).getText().trim();
        driver.findElement(changeContentButton).click();
        new WebDriverWait(driver, 10).withMessage("Element was not found")
                .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='demo']/h2[text()='"+content+"']")));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(driver.findElement(expectedContent).getText(), "AJAX is a technique for accessing web servers from a web page.");
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
   Зайти на сайт https://www.w3schools.com/js/js_ajax_intro.asp
   Запам'ятати елемент "Let AJAX change this text";
   Натиснути кнопку "Change Content";
   За допомогою явногоочікування дочекатися, коли елемент
   "Let AJAX change this text"
   пропаде з DOM;
   Перевірити присутність WEB елемента з текстом
   "AJAX is a technique for accessing web servers from a web page.";
   Запушати код на github у свою вітку.

*/