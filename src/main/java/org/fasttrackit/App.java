package org.fasttrackit;

public class App 
{
    public static void main( String[] args ) {

        Race race = new Race();

        RadioControlledCar dacia = new RadioControlledCar();
        
        dacia.name = "Dacia";
        dacia.color = "red";
        dacia.doorCount = 4;
        dacia.wheelCount = 4;
        dacia.mileage = 8.5;

        Engine daciaEngine = new Engine();
        daciaEngine.manufacturer = "Renault";

        dacia.engine = daciaEngine;

        RadioControlledCar lada = new RadioControlledCar();

        lada.name = "Lada";
        lada.color = "blue";
        lada.doorCount = 2;
        lada.wheelCount = 4;
        lada.mileage = 8;

        Engine ladaEngine = new Engine();
        ladaEngine.manufacturer = "Skoda";

        lada.engine = ladaEngine;

        race.firstcar = dacia;
        race.secondcar = lada;

        dacia.accelerate(18.1);
    }
}
