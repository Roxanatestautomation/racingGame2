package org.fasttrackit;

public class App 
{
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

        Race race = new Race(dacia, lada);
        race.insertCompetitors(0, dacia);
        race.insertCompetitors(1, lada);

        System.out.println(race.getCompetitors()[0].getName());

    }
}
