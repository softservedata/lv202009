package test.java.com.softserve.edu;


import main.java.com.softserve.edu.Appl;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

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