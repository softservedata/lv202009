package com.softserve.hw05;

public class Product {
    private String name; // null
    private double price;

    public Product() {
        name = new String();
        price = 0.0;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        //System.out.println("\ncurrent = " + this);
        //System.out.println("obj = " + obj);
        if (this == obj) {
            return true;
        }
        if ((obj == null)
            || (getClass() != obj.getClass())) {
            return false;
        }
        Product other = null;
        if (obj instanceof Product) {
            other = (Product) obj;
        }
        //
        if ((Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
                || (other == null)
                || ((name == null) && (other.name != null))
                || ((name != null) && (other.name == null))) {
            return false;
        }
        /*-
        if ((other == null)
                || ((name == null) && (other.name != null))
                || ((name != null) && (other.name == null))) {
            return false;
        }
        */
        if ((name == null) && (other.name == null)) {
            return true;
        }
        return name.equals(other.name);
    }

    @Override
    public String toString() {
        return "Product [name=" + name
                + ", price=" + price
                + "]";
    }

}
