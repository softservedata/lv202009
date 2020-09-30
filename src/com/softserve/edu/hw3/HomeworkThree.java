package com.softserve.edu.hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HomeworkThree {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        float[] numbers = new float[3];
        for (int a = numbers.length; a > 0; a--) {
            numbers[a - 1] = Float.parseFloat(reader.readLine());
        }
        Arrays.sort(numbers);
        for (int a = 0; a <= numbers.length - 1; a++) {
            System.out.println(numbers[a]);
        }
    }
}
