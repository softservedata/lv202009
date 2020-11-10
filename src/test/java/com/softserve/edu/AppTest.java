package com.softserve.edu;

/*--------- JUNIT----------------*/
// import org.junit.Assert;
// import org.junit.Test;

/*---------TESTNG----------------*/
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class  AppTest
{

    @Test
    public void testApp()
    {
        Assert.assertTrue( true );
        System.out.println("class AppTest @Test testApp() done");
    }
}
