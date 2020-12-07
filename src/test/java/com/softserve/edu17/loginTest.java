package com.softserve.edu17;

import java.util.concurrent.TimeUnit;

//        Homework 17 (from 23.11.2020)
//        1) Зайти на сайт http://taqc-opencart.epizy.com/
//        Пошук web елементів виконувати виключно за допомогою CSS.
//        Клікнути на My Account.
//        Далі клікнути на Login.
//        Перевірити, чи browser перейшов на сторінку логування.
//        Запушати код на github у свою вітку.


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {
    private final String BASE_URL = "http://taqc-opencart.epizy.com/";
    private final Long IMPLICITLY_WAIT_SECONDS = 10L;
    private final Long ONE_SECOND_DELAY = 1000L;
    private WebDriver driver;

    //Overload
    private void presentationSleep() {
        presentationSleep(1);
    }

    //Overload
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

//	@AfterMethod
//	public void afterMethod() {
//
//	}


    @Test
    public void checkWebElement() throws InterruptedException {


        driver.findElement(By.cssSelector("a[title='My Account']")).click();
        Thread.sleep(1000); // For Presentation Only

        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(1000); // For Presentation Only

        driver.findElement(By.id("input-email")).click();
        driver.findElement(By.id("input-email")).clear();
        driver.findElement(By.id("input-email")).sendKeys("input_email");
        Thread.sleep(1000); // For Presentation Only

        driver.findElement(By.id("input-password")).click();
        driver.findElement(By.id("input-password")).clear();
        driver.findElement(By.id("input-password")).sendKeys("pass");
        Thread.sleep(1000); // For Presentation Only

        driver.quit();

    }
}
