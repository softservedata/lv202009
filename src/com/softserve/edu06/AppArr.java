package com.softserve.edu06;

import java.util.Arrays;
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
        /*-
        int[] arr = { 2, -5, 7, -4, 8, 4 };
        //
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum = " + sum);
        //
        int amount = 0;
        for (int a : arr) {
            if (a > 0 && a <= 7) {
                amount++;
            }
        }
        System.out.println("Amount = " + amount);
        //
        int imax = 0;
        int max = arr[imax];
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
        */
        /*-
        int[][] irregular = { { 1, 9 }, { 2, 3, 4, 8 }, { 5, -1 }, { 6, 7, 0 } };
        int min = irregular[1][0];
        int imin = 1;
        int jmin = 0;
        for (int i=0; i<irregular.length; i++) {
            for (int j=0; j<irregular[i].length; j++) {
                if (irregular[i][j] < min) {
                    min = irregular[i][j];
                    imin = i;
                    jmin = j;
                }
            }
        }
        System.out.print("Minimum = " + min + " imin = " + imin + " jmin = " + jmin);
        */
        /*-
        int[] arr = { 2, -5, 7, -4, 8, 4 };
        System.out.println("Origin array = " + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array = " + Arrays.toString(arr));
        */
        /*-
        int[] arr = { 2, -5, 7, -4, 8, 4 };
        System.out.println("Origin array = " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array = " + Arrays.toString(arr));
        */
        /*-
        Student[] students = { new Student("Ira", 25),
                new Student("Ivan", 21),
                new Student("Andriy", 29),
                new Student("Petro", 32),
                new Student("Stepan", 24) };
        System.out.println("Origin array = " + Arrays.toString(students));
        Arrays.sort(students); // Runtime Error
        //System.out.println("Sorted array = " + Arrays.toString(students));
        */
        Student[] students = { new Student("Ira", 25),
                new Student("Ivan", 21),
                new Student("Andriy", 29),
                new Student("Petro", 32),
                new Student("Stepan", 24) };
        System.out.println("Origin array = " + Arrays.toString(students));
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].getAge() > students[j + 1].getAge()) {
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array = " + Arrays.toString(students));
    }
}