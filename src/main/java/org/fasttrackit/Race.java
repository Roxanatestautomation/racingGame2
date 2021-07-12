package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Race {

    private List<Vehicle>competitors =new ArrayList<Vehicle>();

    public List<Vehicle> getCompetitors() {
        return competitors;
    }

    public String readVehicleName() {
        System.out.println("Please type a name for your vehicle and press Enter.");

        Scanner scanner = new Scanner(System.in);
        String vehicleName = scanner.nextLine();

        System.out.println("Your vehicle`s mane is: " + vehicleName);

        return vehicleName;
    }

    public double readAccelerationSpeed(){
        System.out.println("Please enter acceleration speed as a decimal number...");

        Scanner scanner = new Scanner(System.in);
        double accelerationSpeed = scanner.nextDouble();

        System.out.println("Vehicle`s acceleration speed is: " + accelerationSpeed + " km/h");

        return accelerationSpeed;



    }

}
