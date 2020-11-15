package com.softserve.homework11;

import com.softserve.edu.homework10.Appl10;
import org.testng.Assert;
import org.testng.annotations.*;

public class Appl10Test1 {

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

    @DataProvider(name = "Data-Provider1")
    public Object[ ][ ] parameterIntTestProvider( ) {
        return new Object[ ][ ]{
                {"(hello) () {add} number [10] and \\(0\\)"},
                {"(hello) (People) {add} (){} number [10] and \\(0\\)"},
                {"(hello) (People) {} []() number [10] and \\(0\\)"}
           };
    }

    @Test (groups = "method1")
    public void verifyBracketsPositive() throws Exception{
        System.out.println("Test1 positive");
        String text="(hello) (People) {add} number [10] and \\(0\\)";
        Appl10 appl=new Appl10();
        boolean actual=appl.verifyBrackets(text);
        System.out.println("Actual: "+actual);
        Assert.assertTrue(actual);
    }

    @Test (groups = "method1", dataProvider = "Data-Provider1")
    public void verifyBracketsPositive2(String text) throws Exception{
        System.out.println("Test2 positive");
        Appl10 appl=new Appl10();
        boolean actual=appl.verifyBrackets(text);
        System.out.println("Actual: "+actual);
        Assert.assertTrue(actual);
    }
    @Test
    public void verifyBracketsNegative() throws Exception{
        System.out.println("Test3 negative");
        String text="(hello) (People) {add} [(]) number [10] and \\(0\\)";
        Appl10 appl=new Appl10();
        boolean actual=appl.verifyBrackets(text);
        System.out.println("Actual: "+actual);
        Assert.assertTrue(actual);
    }
}