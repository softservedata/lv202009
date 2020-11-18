package com.softserve.testng;

import com.softserve.edu.CharUtils;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CharUtilsTest {

    // parallel = true - запустити всі тести одразу
    @DataProvider//(parallel = true)
    public Object[][] validDataProvider() {
        return new Object[][]{
                {'A', 65}, {'a', 97},
                {'B', 66}, {'b', 98},
                {'C', 67}, {'c', 99},
                {'D', 68}, {'d', 100},
                {'Z', 90}, {'z', 122},
                {'1', 49}, {'9', 57},
        };
    }

    // тестування коду з main-> CharUtils - переведення з Чар в ціле число, і навпаки
    @Test(dataProvider = "validDataProvider")
    public void CharToASCIITest(final char character, final int ascii) {
        int result = CharUtils.CharToASCII(character);
        Assert.assertEquals(result, ascii);
        System.out.println("+++done ID= " + Thread.currentThread().getId());
    }

    @Test(dataProvider = "validDataProvider")
    public void ASCIIToCharTest(final char character, final int ascii) {
        char result = CharUtils.ASCIIToChar(ascii);
        Assert.assertEquals(result, character);
        System.out.println("+++done ID= " + Thread.currentThread().getId());
    }
}