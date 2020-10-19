package com.softserve.edu09;

public class Appl {
    public static void main(String[] args) {
        // ACar car = new ACar(); // Compile Error
//        ACar carX6 = new BmwX6();
//        carX6.carRides();
//        if (carX6 instanceof BmwX6) {
//            ((BmwX6) carX6).lightsShine();
//        }
        //
//        ACar carX6mod = new BmwX6mod();
//        carX6mod.carRides();
//        if (carX6mod instanceof BmwX6) {
//            ((BmwX6) carX6mod).lightsShine();
//        }
        //
        BmwX6 carX6mod2 = new BmwX6mod();
        carX6mod2.carRides();
        carX6mod2.lightsShine();
    }
}
