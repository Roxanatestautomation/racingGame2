package org.fasttrackit;

public class Vehicle {

    public static String controlType = "Radio Control";

    private String name;
    private String color;
    private int wheelCount;

    public double accelerate (double speed) {
        System.out.println(speed);
        return 0;
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
}
