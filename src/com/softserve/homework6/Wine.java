package com.softserve.homework6;

import com.softserve.homework5.Product;

import java.util.Objects;

public class Wine extends Product {
    private String country;

    public Wine(String name, int price, String country) {
        super(name, price);
        this.country = country;
    }

    @Override
    public String toString() {
        return "Wine{" + "country='" + country + ", name='" + getName() + "', price=" + getPrice() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Wine wine = (Wine) o;
        return Objects.equals(country, wine.country) && Objects.equals(getName(), wine.getName()) && getPrice() == wine.getPrice();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), country);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
