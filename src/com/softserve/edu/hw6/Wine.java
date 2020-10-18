package com.softserve.edu.hw6;

import com.softserve.edu.hw5.ProductUpdate;

import java.util.Objects;

public class Wine extends ProductUpdate {
    private String wineName;
    private double winePrice;
    private String wineCountry;

    public Wine (String wineName, double winePrice, String wineCountry) {
        this.setWineName(wineName);
        this.setWinePrice(winePrice);
        this.setWineCountry(wineCountry);
    }

    public String getWineName() {
        return wineName;
    }

    public void setWineName(String wineName) {
        this.wineName = wineName;
    }

    public double getWinePrice() {
        return winePrice;
    }

    public void setWinePrice(double winePrice) {
        this.winePrice = winePrice;
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
                "wineName='" + wineName + '\'' +
                ", winePrice=" + winePrice +
                ", wineCountry='" + wineCountry + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wine)) return false;
        Wine wine = (Wine) o;
        return Double.compare(wine.winePrice, winePrice) == 0 &&
                wineName.equals(wine.wineName) &&
                wineCountry.equals(wine.wineCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wineName, winePrice, wineCountry);
    }
}
