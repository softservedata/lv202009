package com.softserve.edu.hw11;

import static org.junit.Assert.*;

import org.junit.Test;

import com.softserve.edu.hw10.App;

public class AppTest {
    
    @Test
    public void verifyBracketsTestWithEmptyString() {
        String testText = "";
        boolean result;
        result = App.verifyBrackets(testText);
        assertFalse(result);
    }

    @Test
    public void verifyBracketsTestWithWrongBrackets() {
        String testText = "{}{{[}";
        boolean result;
        result = App.verifyBrackets(testText);
        assertFalse(result);
    }

    @Test
    public void verifyBracketsTestWithWrightBrackets() {
        String testText = "[{()}]{}()[]";
        boolean result;
        result = App.verifyBrackets(testText);
        assertTrue(result);
    }
      
}
