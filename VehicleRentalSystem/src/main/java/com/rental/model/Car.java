package main.java.com.rental.model;


public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String licensePlate, String brand, String model, double rentalPrice, int numberOfDoors) {
        super(licensePlate, brand, model, rentalPrice);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public String getVehicleType() {
        return "Car";
    }
}
