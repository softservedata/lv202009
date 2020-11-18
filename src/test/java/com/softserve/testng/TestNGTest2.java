package com.softserve.testng;

import org.testng.annotations.Test;

public class TestNGTest2 {

    // якщо тест очікує ексепшн; для негативних тестів
    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionWithException() {
        System.out.println("\t\t\t@Test divisionWithException()");
        int i = 1 / 0;
    }

    // тест не ранити;
    @Test(enabled=false)
    public void division2( ) {
        System.out.println("Method is not ready yet");
    }


}