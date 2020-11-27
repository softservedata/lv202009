package com.softserve.homework6;

import com.softserve.homework5.Product;

import java.util.Objects;

public class Coffee extends Product {
    private int aroma;

    public Coffee(String name, int price, int aroma) {
        super(name, price);
        this.aroma = aroma;
    }

    @Override
    public String toString() {
        return "Coffee{" + "aroma=" + aroma + ", name='" + getName() + "', price=" + getPrice() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Coffee coffee = (Coffee) o;
        return aroma == coffee.aroma && Objects.equals(getName(), coffee.getName()) && getPrice() == coffee.getPrice();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), aroma);
    }

    public int getAroma() {
        return aroma;
    }

    public void setAroma(int aroma) {
        this.aroma = aroma;
    }
}
