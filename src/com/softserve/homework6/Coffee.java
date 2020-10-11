package com.softserve.homework6;

import com.softserve.homework5.Product;

import java.util.Objects;

public class Coffee extends Product {
    private int scent;

    public Coffee(String productName, float productPrice, int scent) {
        super(productName, productPrice);
        this.scent = scent;
    }

    @Override
    public String toString() {
        return "Сoffee{" +
                "scent=" + scent +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

    public int getScent() {
        return scent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Coffee coffee = (Coffee) o;
        return scent == coffee.scent && productPrice == coffee.productPrice;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), scent);
    }
}




