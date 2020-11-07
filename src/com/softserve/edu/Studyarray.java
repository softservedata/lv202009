package com.softserve.edu;

import java.util.Arrays;
import java.util.Scanner;

public class Studyarray {
//    String dayWeek[] = new String[7];
//    String[] month;
//    month =

}

//    public static void main () {
//
//        int [] monthDays = {31, 28, 30 , 31, 30};
//
//        // 2 ways to output array
//        System.out.println("month days = " + monthDays);
//        System.out.println("month days = " + Arrays.toString(monthDays));
//
//        for (int current : monthDays) {
//            System.out.println(current + " ");
//        }
//    }


    // 2 вимірні массиви
//    char two1 [][] = new char [3][4];
//    char [] [] two2 = new char [3][4];
//    double m [][] = { { 0,1,2,3},
//                    {4,5,6,7},
//                    {8,9,10,11,12}
//                    };


    // for
//    int [] num = {5, 15, 2, 21, 3};
//    for (int i = 0; i < num.length; i++) {
//    // for (int i = -1; ++i < num.length;) {
//        System.out.println(num[i] + " ");
//    }


    // for each - обходить по колекці
//    for (int current : num) {
//        System.out.println(current + "" );
//    }


        // while
//    int number = 0;
//    while (number <= 5) {
//        System.out.println(number);
//        number++;
//    }
//
//    int ii = 10;
//    do {
//        System.out.println("ii = " + ii + " ");
//
//    }
//     while (ii < 15);


     // break
//    Scanner sc = new Scanner(System.in);
//    int sum = 0;
//    int nn = 0;
//    for (int i = 0; i < 10; i ++) {
//        System.out.println("Input number = ");
//        nn = Integer.parseInt(sc.nextLine());
//        if (nn < 10) && (nn >=0) {
//            System.out.println("continue");
//            continue;
//        }
//        if (nn < 0) {
//            System.out.println("break");
//            break;
//        }
//        sum = sum + nn;
//    }


    // enum
//    enum Season {
//        WINTER, SPRING, SUMMER, AUTUMN;
//
//
//        Season season = Season.WINTER;
//        String month = "March";
//        String name = "WINTER";
//    }
        // Season season = Season.valueOf(name);

//        }
    // Приклад - ввести з клавіатури щось, вивести аутпут, залежно від введеного значення
//    public enum Season {
//        WINTER, SPRING, SUMMER, AUTUMN;
//
//        Season season = Season.WINTER;
//        String month = "March";
//
//        switch (month) {
//                case "December":
//                case "January":
//                case "February":
//                    season = Season.WINTER;
//                    break;
//
//                case "March":
//                case "April":
//                case "May":
//                    season = Season.SPRING;
//                    break;
//                case "June":
//                case "July":
//                case "August":
//                    season = Season.SUMMER;
//                    break;
//                case "September":
//                case "October":
//                case "November":
//                    season = Season.AUTUMN;
//                    break;
//
//                default:
//                    System.out.println("Month is incorrect");
//                    System.exit(0); // use rarely!
//
//            }
//        System.out.println("Season = " + season);

//    public Season nextSeason() {
//        if (this == Season.WINTER) {
//            return Season.SPRING;
//        }
//        if (this == Season.SPRING) {
//            return Season.SUMMER;
//        }
//        if (this == Season.SUMMER) {
//            return Season.AUTUMN;
//        }
//        return Season.WINTER;
//    }
//    }
