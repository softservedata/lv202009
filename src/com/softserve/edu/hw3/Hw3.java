package com.softserve.edu.hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Hw3 {
    static final int NumbersCount = 3; // задаем количество вводимых чисел

    // ввід 3-х чисел з клавіатури
    static int[] ReadData() throws IOException {

        //create reader stream
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbersArray = new int[NumbersCount];

        for (int i=0; i<NumbersCount; i++)
        {
            System.out.println("Please, input number:" + (i+1));
            String data = reader.readLine();

            numbersArray[i] = ConvertToInt(data);
        }

        System.out.println();

        //close reader stream
        reader.close();

        return numbersArray;
    }

    //try to convert string to int
    public static int ConvertToInt(String s)
    {
        try
        {
            return Integer.parseInt(s);
        }
        catch (Exception e) //catch exception and return '0' if string wasn't parsed to int
        {
            System.out.println("Input data is not a number:" + s);
            System.out.println("Value 0 is returned");
            return 0;
        }
    }

    // output the iggest number
    public static void PrintData(int[] numbersArray)
    {
        // System.out.println("Sorted numbers:");
        // System.out.println();

        //for (int i=0; i<NumbersCount; i++)
        {
            // System.out.print("number: " + (i+1));
            // System.out.println(", value is:" + numbersArray[i]);
            // Arrays.sort(numbersArray);
            System.out.println("the biggest number is: " + (numbersArray[numbersArray.length -1]));
        }
    }

    public static void main(String[] args) throws IOException
    {
        int[] numbersArray = ReadData();

        Arrays.sort(numbersArray);

        PrintData(numbersArray);
    }
}