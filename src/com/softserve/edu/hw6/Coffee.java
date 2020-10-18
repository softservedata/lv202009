package com.softserve.edu.hw6;

import com.softserve.edu.hw5.ProductUpdate;

import java.util.Objects;

public class Coffee extends ProductUpdate {
    // У клас Сoffee додати поле, яке характеризує аромат (значення від 1 до 10).
    private String coffeeName;
    private double coffeePrice;
    private int aroma;
    public Coffee (String name, double coffeePrice, int aroma){
        this.setCoffeeName(coffeeName);
        this.setCoffeePrice(coffeePrice);
        this.setAroma(aroma);
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public void setCoffeePrice(double coffeePrice) {
        this.coffeePrice = coffeePrice;
    }

    public void setAroma(int aroma) {
        this.aroma = aroma;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public double getCoffeePrice() {
        return coffeePrice;
    }

    public int getAroma() {
        return aroma;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "coffeeName='" + coffeeName + '\'' +
                ", price=" + coffeePrice +
                ", aroma=" + aroma +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coffee)) return false;
        Coffee coffee = (Coffee) o;
        return Double.compare(coffee.coffeePrice, coffeePrice) == 0 &&
                aroma == coffee.aroma &&
                coffeeName.equals(coffee.coffeeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coffeeName, coffeePrice, aroma);
    }
}
