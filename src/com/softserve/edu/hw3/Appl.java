package com.softserve.edu.hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first number");
        int firstNumber = Integer.parseInt(br.readLine());
        System.out.println("Enter second number");
        int secondNumber = Integer.parseInt(br.readLine());
        System.out.println("Enter third number");
        int thirdNumber = Integer.parseInt(br.readLine());

    }

}
