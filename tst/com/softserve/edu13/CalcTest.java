package com.softserve.edu13;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("CalcTest @BeforeClass setUpBeforeClass()");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("CalcTest @AfterClass tearDownAfterClass()");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("\tCalcTest @Before setUp()");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("\tCalcTest @After tearDown()");
    }

    @Test
    public void testAdd1() {
        /*-
        //int i = 1 / 0;
        double i = 1.0 / 0;
        System.out.println("\t\t\ti = " + i);
        System.out.println("\t\tCalcTest @Test testAdd1()");
        throw new RuntimeException("ha-ha-ha");
        // fail("Not yet implemented");
        */
        Calc calc = new Calc();
        double actual;
        double expected;
        //
        expected = 8;
        actual = calc.add(4, 4);
        //
        Assert.assertEquals(expected, actual, 0.001);
        System.out.println("\t\tCalcTest @Test testAdd1()");
    }

    @Test
    public void testAdd2() {
        Calc calc = new Calc();
        double actual;
        double expected;
        //
        expected = 9;
        actual = calc.add(4, 5);
        //
        Assert.assertEquals(expected, actual, 0.001);
        System.out.println("\t\tCalcTest @Test testAdd2()");
    }
    
    @Test
    public void testDiv1() {
        Calc calc = new Calc();
        double actual;
        double expected;
        //
        expected = 8;
        actual = calc.div(40, 5);
        //
        Assert.assertEquals(expected, actual, 0.001);
        System.out.println("\t\tCalcTest @Test testDiv1()");
    }
    
    @Test
    public void testDiv2() {
        Calc calc = new Calc();
        double actual;
        double expected;
        //
        expected = 2.5;
        actual = calc.div(20, 8);
        //
        Assert.assertEquals(expected, actual, 0.001);
        System.out.println("\t\tCalcTest @Test testDiv2()");
    }

}
