package com.softserve.opencart.data;

public enum Currencies {
    EURO("Euro", "\u20ac"),
    POUND_STERLING("Pound Sterling", "\u00a3"),
    US_DOLLAR("US Dollar", "$");

    //
    private String name;
    private String symbol;

    private Currencies(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String GetSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return name;
    }

}