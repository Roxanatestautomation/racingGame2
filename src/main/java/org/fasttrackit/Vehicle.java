package org.fasttrackit;

public class Vehicle {

    public static final String CONTROL_TYPE = "Radio Control";

    private String name;
    private String color;
    private int wheelCount;
    private double currentSpeed;
    private double mileage;
    private double fuelLevel;


    public double accelerate(double speed) {

        if (fuelLevel > 0) {
        setCurrentSpeed(getCurrentSpeed() + speed); //speed after accelerate//

        double travelDistance = getCurrentSpeed() /60;

        double spentFuel = travelDistance * mileage / 100;

        // left fuel //
        fuelLevel = fuelLevel - spentFuel; //fuelLevel -= spentFuel;//

        System.out.println("Fuel level left for " + getName() + " is: " + fuelLevel);
        System.out.println("Distance traveled" + getName() + " is: " + travelDistance);
        System.out.println();

        return travelDistance;
    } else {
            System.out.println("Vehicle " + name + " is out of fuel!");
            return 0;
        }
    }

    public String getName() {
        return name.trim();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", wheelCount=" + wheelCount +
                '}';
    }

}
