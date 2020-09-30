package com.softserve.edu.hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class readInput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1st number (int):");
        int a = Integer.parseInt(br.readLine());
        System.out.println("2nd number (double):");
        float b = Float.parseFloat(br.readLine());
        System.out.println("3rd number (float):");
        double c = Double.parseDouble(br.readLine());
        double a1 = (double) a;
        double b1 = (double) b;
        double [] input = {a1,b1,c};
        Arrays.sort(input);
//        for (double v : input) {
//            System.out.println(v);
//        }
        System.out.println(Arrays.toString(input));
    }
}
