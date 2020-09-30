package com.softserve.edu.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		int [] mas = new int[3];
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number #1: ");
		mas [0] = in.nextInt();
		System.out.print("Input a number #2: ");
		mas [1] = in.nextInt();
		System.out.print("Input a number #3: ");
		mas [2] = in.nextInt();
		in.close();
		
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        
        System.out.println("Ascending order: " + Arrays.toString(mas));
	}
}
