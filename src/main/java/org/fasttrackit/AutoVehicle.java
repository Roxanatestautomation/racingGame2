package org.fasttrackit;

public class AutoVehicle extends Vehicle {

    private double mileage;
    private Engine engine;

    public AutoVehicle (Engine engine) {
        this.engine = engine;
        System.out.println("Custom constructor called");
    }

    public AutoVehicle (Engine engine, String name) {
        this(engine);
        setName(name);
    }

    public AutoVehicle () {
        this (new Engine());
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
}
