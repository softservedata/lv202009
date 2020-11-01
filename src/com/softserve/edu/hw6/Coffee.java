package com.softserve.edu.hw6;

public class Coffee extends Product {
    private int aromat;
    
    public Coffee(int aromat, double price) {
        super("Coffe", price);
        this.aromat = aromat;
    }
    
    public int getAromat() {
        return aromat;
    }
    
    public void setAromat(int aromat) {
        this.aromat = aromat;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + aromat;
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || (getClass() != obj.getClass())) {
            return false;
        }
        Coffee other = null;
        if (obj instanceof Coffee) {
            other = (Coffee) obj;
        }
        if (other == null) {
            return false;
        }
        return aromat == other.aromat;
    }
    
    @Override
    public String toString() {
        String result = super.toString();
        int beginIndex = result.indexOf("[") + 1;
        int endIndex = result.length() - 1;
        result = result.substring(beginIndex, endIndex);
        return "Coffee [" + result + ", aromat = " + aromat + "]";
    }
    
}
