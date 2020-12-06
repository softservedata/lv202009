package com.softserve.hw13;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BracketTest {
    private Brackets brackets;
    
    @BeforeClass
    public void beforeClass() {
        brackets = new Brackets();
    }
    
    @DataProvider//(parallel = true)
    public Object[][] setBrackets() {
        return new Object[][] {
            { "(\\[)", true },
            { "() [\\}] {}", true },
            { "{(())\\(}", true },
            { "(\\ ()", false },
            { "(]", false },
            { ") (", false },
            { "([)] ", false }
        };
    }
     
    @Test(dataProvider = "setBrackets")
    public void checkValid(String text, boolean expected) {
        Assert.assertEquals(expected, brackets.verifyBrackets(text));
    }
    
}
