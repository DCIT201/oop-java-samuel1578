package main.java.com.rental.model;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String licensePlate, String model, int numberOfDoors) {
        super(licensePlate, model);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double getRentalPrice() {
        return 50.0; // Example fixed price for renting a car
    }

    @Override
    public String toString() {
        return super.toString() + ", Car{" +
                "numberOfDoors=" + numberOfDoors +
                '}';
    }
}
