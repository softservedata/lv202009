package com.softserve.edu.hw2;


public class Appl1 {


    public static void main (String [] ARGS){

        int k=16;
        System.out.println("k++ : " +k++ +" - firstly print, after that add 1");

        k=16;
        System.out.println("++k : "+ ++k +" - firstly add 1, after that print");

        k=16;
        int str;
        str=k+++k;
        System.out.println("k+++k : "+  str +" - sum of k and ++k");

        k=16;
        int n=50;
        int s=n---k;
        System.out.println("50---k : "+ s +" - subtraction of 50-- and k");

        k=16;
        System.out.println("k*k: "+ k*k +" - k squared");

        k=16;
        System.out.println("k/3 : "+ k/3 +" - integer dividing");

        k=16;
        System.out.println("k%3 :  "+ k%3 + " - dividing with remainder");

        k=16;
        boolean answer=k++<++k;
        System.out.println("k++<++k :"+ answer +" - comparison of k++ and ++k");

    }
}
