package com.softserve.edu08a;

import com.softserve.edu08.ClassA;
import com.softserve.edu08.ClassB;

public class ApplAB {
	public static void main(String[] args) {
		System.out.println("The Start.");
		//
//        System.out.println("Test ClassA.");
//        ClassA a;
//        a = new ClassA();
//        System.out.println("a.i = " + a.i);
//        a.m1();
//        a.m2();
//        a.m3();
//        a.m4();
//        a.m6(); // Invalid Solution; ClassA.m6()
//        a.m7();
		// a.m8(); // Compile Error
		//
		// /*-
		System.out.println("Test ClassB.");
		ClassA b; // = null;
		// System.out.println("b.i = " + b.i); // Compile Error not init
		b = new ClassB(); // 1-Polymorphism
		System.out.println("b.i = " + b.i); // from A, fields not virtual; Architecture Error; Fields must be private
		System.out.println("b.getI() = " + b.getI());
		b.m1(); // 2-Polymorphism; running from ClassB; method is virtual by default;
		b.m2();
		b.m3(); // 3-Polymorphism; running m4() from ClassB;
		b.m4();
		// b.m5(); // Compile ERROR
		// ((ClassB) b).m5(); // Code Smell
		if (b instanceof ClassB) {
			((ClassB) b).m5(); // No Runtime Error
		}
		b.m6(); // Running from ClassA
		// ClassB.m6();
		// b.m8(); // Error for other package
		((ClassB) b).m8(); // Running from ClassB
		// */
		//
//        System.out.println("Test_0 ClassB.");
//        ClassB b0;
//        b0 = new ClassB();
//        System.out.println("b0.i = " + b0.i); // from B 
//        b0.m1();
//        b0.m2();
//        b0.m3();
//        b0.m4();
//        b0.m5();
//        b0.m6(); // Running from ClassB
//        b0.m8();
		//
		System.out.println("The End.");
	}
}