package com.softserve.edu.hw2;

public class Apple {

	public static void main(String[] args) {
            {
            	int k=16;
			System.out.println("1. k++ = " + k++ + " - increments the number after the expression is evaluated");
            //++k = 16
            }
            {
            	int k=16;
            System.out.println("2. ++k = " + ++k + " - increments the number before the current expression is evaluted");
            //++k = 17
            }
            {
            	int k=16;
            System.out.println("3. k+++k = " + k+++k);
            //k+++k = 1617
            }
            {
            	int k=16;
            	int a=--k;
                int b=50-a;
            System.out.println("4. 50---k = " + b);
            //50---k = 35
            }
            {
            	int k=16;
            System.out.println("5. k*k = " + k*k);
            //k*k = 256
            }
            {
            	int k=16;
            System.out.println("6. k/3 = " + k/3);
            //k/3 = 5
            }
            {
            	int k=16;
            System.out.println("7. k%3 = " + k%3);
            // k%3 = 1
            }
            {
            	int k=16;
            System.out.println("8. k++<++k = " + k++ + " < " + ++k);
            //k++<++k = 16 < 18
 
            }
	
	}

}
