package com.softserve.homework11;

import com.softserve.edu.homework10.Appl10;
import org.junit.*;

public class Appl10Test {

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("After class");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After");
    }

    @Test
    public void verifyBrackets1() throws Exception{
        System.out.println("Test1");
        String text="(hello) (People) {add} [(]) number [10] and \\(0\\)";
        Appl10 appl=new Appl10();
        boolean actual=appl.verifyBrackets(text);
        System.out.println("Actual: "+actual);
        Assert.assertTrue(actual);
    }

    @Test
    public void verifyBrackets2() throws Exception{
        System.out.println("Test2");
        String text="(hello) (People) {add} number [10] and \\(0\\)";
        Appl10 appl=new Appl10();
        boolean actual=appl.verifyBrackets(text);
        System.out.println("Actual: "+actual);
        Assert.assertTrue(actual);
    }
}