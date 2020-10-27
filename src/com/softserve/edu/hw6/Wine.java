package com.softserve.edu.hw6;

public class Wine extends Product {
    private WineCounrty counrty;

    public Wine(WineCounrty country, double winePrice) {
        super("Wine", winePrice);
        this.counrty = country;
    }

    public WineCounrty getCounrty() {
        return counrty;
    }

    public void setCounrty(WineCounrty counrty)
    {
        this.counrty = counrty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!super.equals(o)
                || (getClass() != o.getClass())) {
            return false;
        }

        Wine othwine = null;
        if (o instanceof Wine) {
            othwine = (Wine) o;
        }
        if ((othwine == null)
            || ((counrty == null) && (othwine.counrty != null))
            || ((counrty != null) && (othwine.counrty == null))
        ) {
            return false;
        }
        if ((counrty == null) && (othwine.counrty == null)) {
            return true;
        }
        return counrty.equals(othwine.counrty);
        }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((counrty == null) ? 0 : counrty.hashCode());
        return result;
    }

    @Override
    public String toString() {
        String result = super.toString();
        int beginIndex = result.indexOf("[") + 1;
        int endIndex = result.length() -1;
        result = result.substring(beginIndex, endIndex);
        return "Wine[" + result + ", country = " + counrty.name() + "]";
    }
    }
