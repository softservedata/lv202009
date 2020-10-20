package com.softserve.edu.hw6;

import com.softserve.edu.hw5.ProductUpd;

import java.util.Objects;

public class Coffee extends ProductUpd {
    private String coffeeAroma;

    public Coffee (String coffeeName, double coffePrice, String coffeeAroma) {
        super(coffeeName, coffePrice);
        this.setcoffeeAroma(coffeeAroma);
    }

    public String getCoffeeAroma() {
        return coffeeAroma;
    }

    public void setcoffeeAroma(String coffeeAroma) {
        this.coffeeAroma = coffeeAroma;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "coffeeName='" + name + '\'' +
                ", coffeePrice=" + price +
                ", coffeeAroma='" + coffeeAroma + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coffee)) return false;
        Coffee coffee = (Coffee) o;
        return Double.compare(coffee.price, price) == 0 &&
                coffee.name.equals(name) &&
                coffee.coffeeAroma.equals(coffeeAroma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, coffeeAroma);
    }
}

