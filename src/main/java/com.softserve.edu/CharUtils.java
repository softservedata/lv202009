package com.softserve.edu;

public class CharUtils {

    // перевести з Чар в Ціле число
    public static int CharToASCII(final char character) {
        return (int) character;
    }

    // перевести з Цілого числа в Чар
    public static char ASCIIToChar(final int ascii) {
        return (char) ascii;
    }
}