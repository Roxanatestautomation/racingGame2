package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Race {

    private List<Vehicle>competitors =new ArrayList<Vehicle>();
    private double trackLength; // lungimea cursei noastre
    private double trackFuelLevel; // nivel de combustibil initial pt toti concurentii
    private int competitorCount = 2; //nr. de competitori din cursa

    public List<Vehicle> getCompetitors() {
        return competitors;
    }

    public String readVehicleName() {
        System.out.println("Please type a name for your vehicle and press Enter.");

        Scanner scanner = new Scanner(System.in);
        String vehicleName = scanner.nextLine();

        System.out.println("Your vehicle`s name is: " + vehicleName);

        return vehicleName;
    }

    public double readAccelerationSpeed() throws Exception {
        System.out.println("Please enter acceleration speed as a decimal number...");

        Scanner scanner = new Scanner(System.in);

        double accelerationSpeed = 0;

        try {
            accelerationSpeed = scanner.nextDouble();
        } catch (InputMismatchException exception) {
            System.out.println("Please enter a valid number.");
            return readAccelerationSpeed(); // se reia method readAccelerationSpeed
        }

        System.out.println("Vehicle`s acceleration speed is: " + accelerationSpeed + " km/h");

        return accelerationSpeed;

    }

    /* metoda prin care se introduce cate un competitor pe rand in cursa,
    sa citim numele competitorului introdus de utilizator de la tastatura si
     sa ii atribuim un obiect de tip vehicle */
    public void addCompetitor() {
        String name = readVehicleName();// citim numele competitorului introdus de la tastatura

        AutoVehicle autoVehicle = new AutoVehicle();
        autoVehicle.setName(name);

        double mileage = ThreadLocalRandom.current().nextDouble(8, 10);

        autoVehicle.setMileage(mileage);

        System.out.println("Mileage for vehicle with name " + autoVehicle.getName() + ": " + mileage + "1/100Km");

        competitors.add(autoVehicle);
    }

    // detreminarea nr de competitori ce vor fi in cursa
    public void addAllCompetitors() {

        for (int i = 0; i < competitorCount; i++) {
            addCompetitor();
        }
    }

    // o metoda prin care se determina castigatorul cursei
    public Vehicle determineWinner () throws Exception {

        int noFuelCompetitors = 0;

        while (noFuelCompetitors < competitorCount) {

            for (Vehicle vehicle : competitors){
                double accelerationSpeed = readAccelerationSpeed();
                double travelDistance = vehicle.accelerate(accelerationSpeed);// distanta parcursa de vehicul

                if(vehicle.getFuelLevel() <= 0) {
                    noFuelCompetitors++;
                }

                if (travelDistance >= trackLength) {
                    System.out.println("The winner of the race is: " + vehicle.getName());
                    return vehicle;
                }
            }
        }
        return null;
    }

    public void start() throws Exception {
        addAllCompetitors();
        determineWinner();
    }

    public void setTrackLength(double trackLength) {
        this.trackLength = trackLength;
    }

    public void setTrackFuelLevel(double trackFuelLevel) {
        this.trackFuelLevel = trackFuelLevel;
    }
}
