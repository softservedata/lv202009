package test.java.com.softserve.edu;


import main.java.com.softserve.edu.Appl;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;


public class ApplTest {


    @DataProvider
    public Object[][] bracketsDataProvider() {
        return new Object[][] {
                { "{}{{}}", true },  { "{}", true },
                { "{{]", false },  { "\\]", false },
                { "{(())}", true },  { "(\\\\()", true },
                { "", false },  { "([)] ", false },
                { "()", true },  { "() [] {}", true },
                { "[]", true },  { "[}", false },
                { "{]", false },  { "[}", false },

        };
    }
    @Test
    public void verifyBracketsTestWithEmptyString() {
        String testText = "";
        boolean result;
        result = Appl.verifyBrackets(testText);
        assertFalse(result);
    }

    @Test(dataProvider = "bracketsDataProvider")
    public void verifyBracketsTestWithWrongBrackets(String testText,final boolean expectedResult) {
        boolean result;
        result = Appl.verifyBrackets(testText);
        assertEquals(expectedResult,result);
    }
}