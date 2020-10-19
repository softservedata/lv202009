package com.softserve.edu09;

public abstract class ACar {
    private double maxSpeed;

    public ACar() {
        System.out.println("public ACar() done");
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    abstract void carRides();
}
