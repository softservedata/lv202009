package com.softserve.edu.homework6;


import com.softserve.edu.homework5.Product;

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
    }
}
