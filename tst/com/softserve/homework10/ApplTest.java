package com.softserve.homework10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ApplTest {
    @Test
    public void verifyBracketsTestWithEmptyString() {
        String testText = "";
        boolean result;
        result = Appl.verifyBrackets(testText);
        assertFalse(result);
    }

    @Test
    public void verifyBracketsTestWithWrongBrackets() {
        String testText = "{}{{[}";
        boolean result;
        result = Appl.verifyBrackets(testText);
        assertFalse(result);
    }

    @Test
    public void verifyBracketsTestWithWrightBrackets() {
        String testText = "[{()}]{}()[]";
        boolean result;
        result = Appl.verifyBrackets(testText);
        assertTrue(result);
    }
}