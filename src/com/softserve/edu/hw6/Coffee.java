package com.softserve.edu.hw6;

import java.util.Objects;

public class Coffee extends Product {
    private int coffeeAroma;

    public Coffee (String coffeeName, double coffeePrice, int coffeeAroma) {
        super("Coffee", coffeePrice, coffeeAroma);
        this.coffeeAroma = coffeeAroma;
    }

    public int getCoffeeAroma() {
        return coffeeAroma;
    }

    public void setCoffeeAroma(int coffeeAroma) {
        this.coffeeAroma = coffeeAroma;
    }

    @Override
    public String toString() {
        return "Coffee[coffeeAroma = " + coffeeAroma + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!super.equals(o)
            || (getClass() != o.getClass())) {
            return false;
           }

        Coffee othcoffee = null;
        if (o instanceof Coffee) {
            othcoffee = (Coffee) o;
        }
        if (o == null) {
            return false;
        }
        return coffeeAroma == othcoffee.coffeeAroma;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + coffeeAroma;
        return result;
    }

    }