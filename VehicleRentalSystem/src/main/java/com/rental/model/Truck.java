package main.java.com.rental.model;


public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String licensePlate, String brand, String model, double rentalPrice, double loadCapacity) {
        super(licensePlate, brand, model, rentalPrice);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    
    @Override
    public String getVehicleType() {
        return "Truck";
    }
}