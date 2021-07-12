package org.fasttrackit;

public class App {
    public static void main( String[] args ) {

        Engine daciaEngine = new Engine();
        daciaEngine.setManufacturer("Renault");

        RadioControlledCar dacia = new RadioControlledCar(daciaEngine);

        dacia.setName("Dacia");
        dacia.setColor("red");
        dacia.setDoorCount(4);
        dacia.setWheelCount(4);
        dacia.setMileage(8.5);
        dacia.setFuelLevel(40.5);


        Engine ladaEngine = new Engine();
        ladaEngine.setManufacturer("Skoda");

        RadioControlledCar lada = new RadioControlledCar(ladaEngine);

        lada.setName("Lada");
        lada.setColor("blue");
        lada.setDoorCount(2);
        lada.setWheelCount(4);
        lada.setMileage(8);

        dacia.accelerate(20);

        Vehicle harley = new RadioControlledMotorcycle(new Engine());
        harley.setName("Harley");
        harley.accelerate(10);

        Race race = new Race();

        race.getCompetitors().add(dacia);
        race.getCompetitors().add(lada);

        // enhanced for loop //
        for (Vehicle vehicle : race.getCompetitors()) {

            if(vehicle != null) {
                System.out.println(vehicle.getName());
            }
        }

        race.readVehicleName();
        race.readAccelerationSpeed();

    }
}