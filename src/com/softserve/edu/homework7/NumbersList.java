package com.softserve.edu.homework7;

public class NumbersList implements Comparable<NumbersList>{
    private int number;
    public NumbersList(int number){
    this.setNumber(number);
    }

    @Override
    public int compareTo(NumbersList numbersList) {
        return number-numbersList.getNumber();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.getNumber();
        return result;
    }
    @Override
    public String toString(){
        return ""+number;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        NumbersList other = (NumbersList) obj;
        if (this.getNumber() != other.getNumber()) return false;
        return true;
    }
}
