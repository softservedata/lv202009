package com.softserve.edu.hw3;

import javax.xml.soap.SOAPPart;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) throws IOException {

        //    Прочитати з клавіатури три числа (цілих або дійсних).
        //    Вивести ці числа на екран у порядку зростання.
        //    Для коду використати пакет com.softserve.edu.hw3
        //    Закомітити та запушати код на github у свою вітку.

        // ввід з клавіатури
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть число №1:");
        String num1 = reader.readLine();
        System.out.println("Введіть число №2:");
        String num2 = reader.readLine();
        System.out.println("Введіть число №3:");
        String num3 = reader.readLine();

        // стрoка -> число
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int n3 = Integer.parseInt(num3);

//        if (n1 >= n2 && n2 >= n3) System.out.print("\n" + n3 + " " + n2 + " " + n1);
//        else if (n1 >= n3 && n3 >= n2) System.out.print("\n" + n2 + " " + n3 + " " + n1);
//        else if (n2 >= n1 && n1 >= n3) System.out.print("\n" + n3 + " " + n1 + " " + n2);
//        else if (n2 >= n3 && n3 >= n1) System.out.print("\n" + n1 + " " + n3 + " " + n2);
//        else if (n3 >= n1 && n1 >= n2) System.out.print("\n" + n2 + " " + n1 + " " + n3);
//        else if (n3 >= n2 && n2 >= n1)System.out.print("\n" + n1 + " " + n2 + " " + n3);

        int[] array = new int[] {n1, n2, n3};
        Arrays.sort(array);
        System.out.println(array[array.length - 1]);
    }
}