package com.softserve.testng;

import org.testng.annotations.*;

public class SecondTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("@BeforeSuite SecondTest");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("@AfterSuite SecondTest");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("\t@BeforeTest SecondTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("\t@AfterTest SecondTest");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("\t\t@BeforeClass SecondTest");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("\t\t@AfterClass SecondTest");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("\t\t\t@BeforeMethod SecondTest");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("\t\t\t@AfterMethod SecondTest");
    }

    @Test
    public void f1() {
        System.out.println("\t\t\t\t@Test f1() SecondTest");
    }

    @Test
    public void f2() {
        System.out.println("\t\t\t\t@Test f2() SecondTest");
    }

}