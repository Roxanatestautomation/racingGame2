package org.fasttrackit;

public class Race {

    private Vehicle[] competitors = new Vehicle[10]; // array with a certain number of objects//

    public Race(Vehicle...competitors) { //introduce a parameter "varargs" (Vehicle...), a array with unlimited elements//
    this.competitors=competitors;
    }

    public Vehicle[] getCompetitors() {
        return competitors;
    }

    //instead of setter, crete a method that will insert elements one at the time//

    public void insertCompetitors(int index, Vehicle vehicle){
        competitors[index]=vehicle;

    }
}
