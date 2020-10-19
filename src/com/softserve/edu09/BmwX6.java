package com.softserve.edu09;

public class BmwX6 extends ACar {
    
    public BmwX6() {
        System.out.println("public BmwX6() done");
    }

    @Override
    public void carRides() {
        setMaxSpeed(200);
        System.out.println("Car Rides");
        workedEngine();
        workedGearBox();
    }

    public void workedEngine() {
        System.out.println("BmwX6: Engine Running on Petrol.");
        System.out.println("BmwX6: Max Speed: " + getMaxSpeed());
    }

    private void workedGearBox() {
        System.out.println("BmwX6: Worked GearBox.");
    }

    public void lightsShine() {
        System.out.println("BmwX6: Halogen Headlights.");
    }
}
