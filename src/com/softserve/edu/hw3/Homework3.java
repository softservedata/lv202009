package com.softserve.edu.hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Homework3 {

    private int num[]=new int[3];

    private int [] enterNum() throws Exception {
        int arr[]= new int[3];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number1 and press enter: " );
        arr[0]=Integer.parseInt(reader.readLine());
        System.out.println("Enter number2 end press enter: " );
        arr[1]=Integer.parseInt(reader.readLine());
        System.out.println("Enter number3 end press enter: " );
        arr[2]=Integer.parseInt(reader.readLine());
        return arr;
    }

    private void printSortedNum (int arr[]){
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = tmp;
                    needIteration = true;
                }
            }
        }
        System.out.println("Sorted numbers: "+ Arrays.toString(arr));
    }

        public static void main (String [] ARGS) throws Exception {

            Homework3 hw3 =new Homework3();
            hw3.num=hw3.enterNum();
            System.out.println("Entered numbers: "+ Arrays.toString( hw3.num));
            hw3.printSortedNum(hw3.num);
        }
}
