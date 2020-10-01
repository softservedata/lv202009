package com.softserve.edu;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Example {

    private int num = 321; // default = 0

    // JVM add default Constructor
    // public Example() {}

    /**
     * Method <font color="red">Main</font>
     * 
     * @param args form comman line
     * @throws IOException
     */
    public static void main(String[] args) throws Exception {
        /*-
        int k = 48;
        //String s = "Hello"; // new String("Hello");
        String s = new String("Hello");
        //
        System.out.println("k = " + k + "   k as char = " + ((char)k));
        System.out.println("My first program from dev.\nHello World!");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Arg " + i + " is " + args[i]);
        }
        */
        /*-
        int n;
        // CTR+SHIFT+O
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("n = ");
        String text = br.readLine();
        System.out.println("text = " + text);
        n = (int) text.charAt(0);
        System.out.println("n = " + n);
        n = Integer.parseInt(text);
        System.out.println("parse n = " + n);
        n= n+1;
        System.out.println("updated (n+1) = " + n);
        br.close();
        */
        /*-
        Scanner sc = new Scanner(System.in);
        System.out.print("i = ");
        int i = sc.nextInt();
        System.out.print("j = ");
        int j = sc.nextInt();
        System.out.println("i + j = " + (i + j));
        System.out.print("name = ");
        String name = sc.nextLine();
        name = sc.nextLine();
        System.out.println("name is: " + name + " done");
        sc.close();
        //
        Example ex = new Example();
        System.out.println("num = " + ex.num);
        //
        long l0 = i;
        System.out.println("l0 = " + l0);
        //
        byte b = 1;
        b = (byte) (b + 1); // 1 is int = 4 byte
        System.out.println("b = " + b);
        //
        double d = 121.12;
        long l1 = (long)d;
        System.out.println("l1 = " + l1);
        */
        //
        Person p = new Person();
        p.name = "Ivan";
        p.print();
        p.print("Hello");
        p.print(" Hello ", " time ", 12);
        p.print(" Hello ", " time ", 12, 00, "1aa");
        //
        Student st0 = new Student("Ivan", 25);
        Student st = new Student("Ira", 22);
        st.setName("Olya");
        st.setName("Petro");
        System.out.println("\nname = " + st.getName());
        // st.print();
        //Student.print();
        //List<Integer> ls = Arrays.asList(1, 3, 2, 6);
        //Arrays a = new Arrays();
        //System.out.println("Student st.hashCode() = "+ st.hashCode());
        System.out.println("Student st = "+ st); // st.toString()
        System.out.println("st0 = " + st0);
    }
}
