package com.softserve.edu.homework6;


import com.softserve.edu.homework5.Product;

import java.util.*;

public class Appl {

    public static void main (String [] ARGS){

        Figure[] figure =  {
                new Rectangle(10,15),
                new Rectangle(10,20),
                new Square(5,5),
                new Square(10,10),
                new Square(20,20)};
        for (Figure f : figure) {
            System.out.println(f.toString());
            System.out.println("Perimeter: "+f.Perimeter());
        }
        System.out.println("\n\n");

        Product[] product =  {
                new Wine("Andalucia",15.5,"Spain"),
                new Coffee("Supremo",21.7, 5),
                new Coffee("Yirgacheffe Ethiopia",12.8, 8),
                new Wine("Proseco",35.2,"Italy"),
                new Wine("Proseco Platinum",45.4,"Italy"),
                new Wine("Galicia",55.0,"Spain"),
                new Wine("Navarra",41.7,"Spain"),
                new Coffee("Arabica Mysore",19.2, 8),
                new Coffee("Old Java",9, 4),
                new Coffee("Brazil Yellow bourbon",17.4, 8),
                new Coffee("Sidamo Ethiopia",11.1, 6)};

        double maxWinePrice=0;
        String maxPriceProductName="";
        double minCoffeePrice=((Coffee)product[1]).getPrice();
        int maxAromaCoffee=0;
        String minPriceMaxAromaCoffee="";
        for (Product p : product){
            p.toString();
            if(p instanceof Wine){
                if(((Wine) p).getOriginCountry().equals("Spain")){
                    if (p.getPrice()>maxWinePrice){
                        maxWinePrice=p.getPrice();
                        maxPriceProductName=p.getProductName();
                    }
                }
            }
            else if (p instanceof Coffee){
            if (((Coffee) p).getAroma()>maxAromaCoffee||((Coffee) p).getAroma()==maxAromaCoffee){
                maxAromaCoffee=((Coffee) p).getAroma();
                if (p.getPrice()<minCoffeePrice){
                    minCoffeePrice=p.getPrice();
                    minPriceMaxAromaCoffee=p.getProductName();
                }
            }
            }
        }
        System.out.println("\nThe most expensive spanish wine is '"+maxPriceProductName+"' - $"+maxWinePrice);
        System.out.println("The cheapest aromatic coffee is '"+minPriceMaxAromaCoffee+"' - $"+minCoffeePrice);

        //************************************ HW for lesson 19.10.2020:

        List<NumbersList> list1=new ArrayList();
        List<NumbersList> list2=new ArrayList();

        list1.add(new NumbersList(1));
        list1.add(new NumbersList(3));
        list1.add(new NumbersList(22));
        list1.add(new NumbersList(1));
        list1.add(new NumbersList(9));
        list2.add(new NumbersList(22));
        list2.add(new NumbersList(3));
        list2.add(new NumbersList(3));
        list2.add(new NumbersList(9));
        list2.add(new NumbersList(9));
        list2.add(new NumbersList(1));
        System.out.println("Array1: "+Arrays.asList(list1));
        System.out.println("Array2: "+Arrays.asList(list2));
        Collections.sort(list1);
        Collections.sort(list2);
        Set set1=new TreeSet();
        Set set2=new TreeSet();
        set1.addAll(list1);
        set2.addAll(list2);
        System.out.println(set1 + "\n"+set2);
        if (set1.equals(set2)){
            System.out.println("hash1="+set1.hashCode()+"  \t hash2="+set2.hashCode());
            System.out.println("Numbers in the lists are the same");
        } else System.out.println("Numbers in the lists are different");


    }
}
