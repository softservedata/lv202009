package com.softserve.edu.hw6;

import com.softserve.edu.hw5.ProductUpd;

import java.util.Objects;

public class Wine extends ProductUpd {
    private String wineCountry;

    public Wine (String wineName, double winePrice, String wineCountry) {
        super(wineName, winePrice);
        this.setWineCountry(wineCountry);
    }

    public String getWineCountry() {
        return wineCountry;
    }

    public void setWineCountry(String wineCountry) {
        this.wineCountry = wineCountry;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "wineName='" + name + '\'' +
                ", winePrice=" + price +
                ", wineCountry='" + wineCountry + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wine)) return false;
        Wine wine = (Wine) o;
        return Double.compare(wine.price, price) == 0 &&
                wine.name.equals(name) &&
                wine.wineCountry.equals(wineCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, wineCountry);
    }
}
