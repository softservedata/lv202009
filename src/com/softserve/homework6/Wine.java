package com.softserve.homework6;

import com.softserve.homework5.Product;

import java.util.Objects;

public class Wine extends Product {
    private String origin;

    public Wine(String productName, float productPrice, String origin) {
        super(productName, productPrice);
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "origin='" + origin + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

    public String getOrigin() {
        return origin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Wine wine = (Wine) o;
        return Objects.equals(origin, wine.origin) && productPrice == wine.productPrice;
            }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), origin);
    }
}
