package org.fasttrackit;

public class Race {
    private Vehicle firstCompetitor;
    private Vehicle secondCompetitor;

    public Race(Vehicle firstCompetitor, Vehicle secondCar) {
        this.firstCompetitor = firstCompetitor;
        this.secondCompetitor = secondCar;
    }

    public Vehicle getFirstCompetitor() {
        return firstCompetitor;
    }

    public Vehicle getSecondCar() {
        return secondCompetitor;
    }
}
