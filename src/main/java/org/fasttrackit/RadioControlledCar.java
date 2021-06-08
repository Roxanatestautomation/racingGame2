package org.fasttrackit;

public class RadioControlledCar extends Autovehicle {

    public static String controlType = "Radio Control";
    private int doorCount;

    public RadioControlledCar(Engine engine) {
        super(engine);
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
}
