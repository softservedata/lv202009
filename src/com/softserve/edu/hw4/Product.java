package com.softserve.edu.hw4;

import java.util.HashMap;
import java.util.Map;

public class Product {

    private String name;
    private int price;

    public Product() {
        name = "";
        price = 0;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Product egg = new Product("egg", 3);
        Product apple = new Product("apple", 10);
        Product cheese = new Product("cheese", 25);
        Product toy = new Product("toy", 40);

        Map<String, Integer> map = new HashMap<>(); 
        map.put(egg.name, egg.price); 
        map.put(apple.name, apple.price); 
        map.put(cheese.name, cheese.price); 
        map.put(toy.name, toy.price); 
        map.entrySet().stream()
        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()) 
        .forEach(System.out::println);
     }
}
