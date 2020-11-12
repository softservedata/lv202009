package com.softserve.edu.hw10;

import org.junit.Assert;

public class VerifyBracketsTest {

    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("VerifyBracketsTest Before");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("VerifyBracketsTest After");
    }

    @org.junit.Test
    public void verifyBrackets1() {
        System.out.println("VerifyBracketsTest Test1");

        VerifyBrackets v1 = new VerifyBrackets();

        String expected = "(())";
        String actual = "(())";
        //
        Assert.assertEquals("",expected, actual);
    }

    @org.junit.Test
    public void verifyBrackets2() {
        System.out.println("VerifyBracketsTest Test2");

        VerifyBrackets v1 = new VerifyBrackets();

        String expected = "(())";
        String actual = "(()]";

        Assert.assertEquals("",expected, actual);
    }
}