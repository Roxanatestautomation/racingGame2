package org.fasttrackit;

public class AutoVehicle extends Vehicle {

    private double mileage;
    private Engine engine;
    private double fuelLevel;

    public AutoVehicle (Engine engine) {
        this.engine = engine;
    }

    public AutoVehicle (Engine engine, String name) {
        this(engine);
        setName(name);
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    @Override
    public double accelerate(double speed) {
        setCurrentSpeed(getCurrentSpeed() + speed); //speed after accelerate//

        double travelDistance = getCurrentSpeed() /60;

        double spentFuel = travelDistance * mileage / 100;

        // left fuel //
        fuelLevel = fuelLevel - spentFuel; //fuelLevel -= spentFuel;//

        System.out.println("Fuel level left for " + getName() + " is: " + fuelLevel);
        System.out.println("Distance traveled" + getName() + " is: " + travelDistance);
        System.out.println();

        return travelDistance;
    }
}
