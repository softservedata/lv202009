package com.softserve.edu06;

import java.util.Scanner;

public class AppArr {
    public static void main(String[] args) {
        /*-
        int[] monthDays = new int[12];
        monthDays[0] = 31;
        monthDays[1] = 28;
        monthDays[2] = 31;
        monthDays[3] = 30;
        monthDays[4] = 31;
        monthDays[5] = 30;
        monthDays[6] = 31;
        monthDays[7] = 31;
        monthDays[8] = 30;
        monthDays[9] = 31;
        monthDays[10] = 30;
        monthDays[11] = 31;
        */
        // int[] monthDays = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        // };
        int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        /*-
        for (int i = 0; i < monthDays.length; i++) {
            System.out.println("monthDays[" + i + "]=" + monthDays[i]);
        }
        */
        //
        // System.out.println("monthDays = " + monthDays); // toString()
        // System.out.println("monthDays = " + Arrays.toString(monthDays));
//        System.out.print("monthDays = ");
//        for (int current : monthDays) {
//            System.out.print(current + "  ");
//        }
        /*-
        int[][] irregular = { { 1 }, { 2, 3, 4 }, { 5 }, { 6, 7 } };
        System.out.println("\nirregular array:");
        for (int i = 0; i < irregular.length; i++) {
            for (int j = 0; j < irregular[i].length; j++) {
                System.out.print(irregular[i][j] + " ");
            }
            System.out.println();
        }
        */
        /*-
        int number = 0;
        while (number <= 5) {
            System.out.println(number);
            number++;
        }
        //
        int i = 0;
        do {
            System.out.print("i = " + (++i) + "  ");
        } while (i < 5);
        */
        /*-
        int[] numbers = { 5, 6, 8, 3, 5, 7, 9 };
        for (int i = 0; i < numbers.length; i++) {
        //for (int i = -1; ++i < numbers.length; ) {
            System.out.print(numbers[i] + "  ");
        }
        System.out.println();
        //
        for (int current : numbers) {
            System.out.print(current + "  ");
        }
        */
        /*-
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Input number = ");
            n = Integer.parseInt(sc.nextLine());
            if ((n < 10) && (n >= 0)) {
                System.out.println("continue");
                continue;
            }
            if (n < 0) {
                System.out.println("break");
                break;
            }
            sum = sum + n;
        }
        System.out.println("sum = " + sum);
        sc.close();
        */
        int[] arr = { 2, -5, 7, -4, 8, 4 };
        int max = arr[0];
        int imax = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > max) {
                max = arr[i];
                imax = i;
            }
            i++;
        }
        System.out.print("Maximum = " + max);
        System.out.println(" is in " + (imax + 1) + " place");

    }
}
