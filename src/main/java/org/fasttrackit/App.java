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


        Engine ladaEngine = new Engine();
        ladaEngine.setManufacturer("Skoda");

        RadioControlledCar lada = new RadioControlledCar(ladaEngine);

        lada.setName("Lada");
        lada.setColor("blue");
        lada.setDoorCount(2);
        lada.setWheelCount(4);
        lada.setMileage(8);

        RadioControlledMotorcycle harley = new RadioControlledMotorcycle(new Engine());

        Race race = new Race(dacia, harley);

        new AutoVehicle(new Engine(), "Opel");

        System.out.println(dacia.toString());

        Vehicle car1 = new RadioControlledCar(new Engine());
        car1.accelerate(10.1);
        AutoVehicle car2 = new RadioControlledCar(new Engine());
        car2.accelerate(11.1);
        RadioControlledCar car3 = new RadioControlledCar(new Engine());
        car3.accelerate(12.1);
        car3.checkRadioResponse();
    }
}
