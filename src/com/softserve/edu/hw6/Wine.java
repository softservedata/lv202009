package com.softserve.edu.hw6;

import com.softserve.edu.hw5.Product;

import java.util.Objects;

public class Wine extends com.softserve.edu.hw5.Product {
    String originCountry;

    public String getOriginCountry() {
        return this.originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public Wine() {
        super();
        originCountry = "";
    }

    public Wine(String ProductName, double ProductPrice, String originCountry) {
        super(ProductName, ProductPrice);
        this.originCountry = originCountry;
    }

    public String toString() {
        return String.format("Wine Name: %s, Wine Price: %.2f, Wine Origin Country: %s", super.getProductName(), super.getProductPrice(), originCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getProductName(), super.getProductPrice(), getOriginCountry());
    }

    @Override
    public boolean equals(Object p) {
        if (this == p) return true;
        if (p == null || getClass() != p.getClass()) return false;

        Wine other = null;
        if (p instanceof Wine) {
            other = (Wine) p;
        }

        if (
                (other == null) ||
                        (super.getProductPrice() != other.getProductPrice()) ||
                        (!super.getProductName().equals(other.getProductName())) ||
                        (!originCountry.equals(other.originCountry))) {
            return false;
        }
        return true;
    }
    public static Wine GetBestWine(Wine[] WineArray) {
        Wine BestWine = WineArray[0];
        for (Wine wine : WineArray) {
            if (wine == null) {
                continue;
            }

            if ((wine.getProductPrice() > BestWine.getProductPrice()) &&
                    (wine.getOriginCountry().equals("Spain"))) {
                BestWine = wine;
            }
        }
        return BestWine;
    }
}