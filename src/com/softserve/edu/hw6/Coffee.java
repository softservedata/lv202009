package com.softserve.edu.hw6;

import com.softserve.edu.hw5.Product;

import java.util.Objects;

public class Coffee extends com.softserve.edu.hw5.Product {
    private int aroma;

    public int getAroma() {
        return aroma;
    }

    public void setAroma(int aroma) {
        this.aroma = aroma;
    }

    public Coffee() {
        super();
        aroma = 1;
    }

    public Coffee(String ProductName, double ProductPrice, int aroma) {
        super(ProductName, ProductPrice);
        this.aroma = aroma;
    }

    public String toString() {
        return String.format("Coffee Name: %s, Coffee Price: %.2f, Coffee Aroma: %d", super.getProductName(), super.getProductPrice(), aroma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getProductName(), super.getProductPrice(), getAroma());
    }

    @Override
    public boolean equals(Object p) {
        if (this == p) return true;
        if (p == null || getClass() != p.getClass()) return false;

        Coffee other = null;
        if (p instanceof Coffee) {
            other = (Coffee) p;
        }

        if (
                (other == null) ||
                        (super.getProductPrice() != other.getProductPrice()) ||
                        (!super.getProductName().equals(other.getProductName())) ||
                        (aroma != other.aroma)) {
            return false;
        }
        return true;
    }

    public static Coffee GetBestCoffee(Coffee[] CoffeeArray) {
        Coffee BestCoffee = CoffeeArray[0];
        for (Coffee coffee : CoffeeArray) {
            if (coffee == null) {
                continue;
            }

            if ((coffee.getProductPrice() < BestCoffee.getProductPrice()) &&
                    coffee.getAroma() > BestCoffee.getAroma()) {
                BestCoffee = coffee;
            }
        }
        return BestCoffee;
    }
}