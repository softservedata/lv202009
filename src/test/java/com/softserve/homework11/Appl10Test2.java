package com.softserve.homework11;

import com.softserve.edu.homework10.Appl10;
import org.testng.Assert;
import org.testng.annotations.*;

public class Appl10Test2 {

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("After class");
    }

    @BeforeMethod
    public void setUp() throws Exception {
        System.out.println("Before method");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        System.out.println("After method");
    }

    @Test (groups = "method1")
    @Parameters(value="number")
    public void verifyBracketsPositive(int number) throws Exception{
        System.out.println("suite2 Test1 positive");
        System.out.println("Parameterized Number is: " +number);
        String text="(hello) (People) {add} number [10] and \\(0\\)";
        Appl10 appl=new Appl10();
        boolean actual=appl.verifyBrackets(text);
        System.out.println("Actual: "+actual);
        Assert.assertTrue(actual);
    }

    @Test
    public void verifyBracketsNegative() throws Exception{
        System.out.println("suite2 Test2 negative");
        String text="(hello) (People) {add} [(]) number [10] and \\(0\\)";
        Appl10 appl=new Appl10();
        boolean actual=appl.verifyBrackets(text);
        System.out.println("Actual: "+actual);
        Assert.assertTrue(actual);
    }
}