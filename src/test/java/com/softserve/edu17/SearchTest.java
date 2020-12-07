package com.softserve.edu17;
import java.util.List;
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


// перейти на сайт і Проскролити

// через JS інєкцію

public class SearchTest {
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

    private WebElement getProductByName(String name) {
        WebElement result = null;
        List<WebElement> containers = driver.findElements(By.cssSelector("div.product-layout.product-grid"));
        for (WebElement current : containers) {
            if (current.findElement(By.cssSelector("h4 > a")).getText().equals(name)) {
                result = current;
                break;
            }
        }
        if (result == null) {
            // Develop Custom Exception
            throw new RuntimeException("WebElement by title/name: " + name + " not found");
        }
        return result;
    }

    //@Test
    public void findByCss() {
        // Precondition
        // Choose Curency
        driver.findElement(By.cssSelector("button.btn.btn-link.dropdown-toggle")).click();
        presentationSleep(); // For Presentation ONLY
        driver.findElement(By.cssSelector("button[name='USD']")).click();
        presentationSleep(); // For Presentation ONLY
        //
        // Steps
        driver.findElement(By.cssSelector("#search > input")).click();
        driver.findElement(By.cssSelector("input.form-control.input-lg")).clear();
        driver.findElement(By.cssSelector("#search > input")).sendKeys("mac");
        presentationSleep(); // For Presentation ONLY
        //
        driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
        presentationSleep(); // For Presentation ONLY
        //
        /*-
        driver.findElement(By.cssSelector("a:contains('MacBook')")).click(); // Selenium ERROR
        Search a $("div.product-layout.product-grid h4 > a")
        Search h4 $("div.product-layout.product-grid h4:has(> a)")
        Search Price $("div.product-layout.product-grid h4:has(> a[href*='id=43']) + p + p")
        Search Price $("div.product-layout.product-grid div:has(> h4 > a[href*='id=43']) > p[class='price']")
        Search Price $("div.product-layout.product-grid div:has(> h4 > a[href*='id=43']) > p.price")
        */
        //
        // Check
        // WebElement price =
        // driver.findElement(By.cssSelector("div.product-layout.product-grid div:has(>
        // h4 > a[href*='id=43']) > p.price")); // id=43 Hardcode Invalid Solution
        WebElement price = getProductByName("MacBook").findElement(By.cssSelector("p.price"));
        //WebElement price = getProductByName("MacBook").findElement(By.xpath(".//p[@class='price']"));
        System.out.println("***price = " + price.getText().trim());
        Assert.assertTrue(price.getText().contains("$602.00"));
        //
        // Return to Previous State
        presentationSleep(); // For Presentation ONLY
    }

    @Test
    public void findByXPath() {
        // Precondition
        // Choose Curency
        driver.findElement(By.xpath("//button[@class='btn btn-link dropdown-toggle']")).click();
        presentationSleep(); // For Presentation ONLY
        driver.findElement(By.xpath("//button[@name='USD']")).click();
        presentationSleep(); // For Presentation ONLY
        //
        // Steps
        // Type Search Field
        driver.findElement(By.xpath("//input[@name='search']")).click();
        driver.findElement(By.xpath("//input[@name='search']")).clear();
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("mac");
        presentationSleep(); // For Presentation ONLY
        //
        // Click Search Button
        driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
        presentationSleep(); // For Presentation ONLY
        //
        // Check
        WebElement price = driver.findElement(By.xpath("//a[text()='MacBook']/../following-sibling::p[@class='price']"));
        System.out.println("***price = " + price.getText().trim());
        Assert.assertTrue(price.getText().contains("$602.00"));
        //
        // Return to Previous State
        presentationSleep(); // For Presentation ONLY
    }

}


