package main.java.com.rental.transaction;

public abstract class Vehicle {
    private String licensePlate;
    private String brand;
    private String model;
    private double rentalPrice;
    private boolean rented; 

    // Constructor
    public Vehicle(String licensePlate, String brand, String model, double rentalPrice) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.rentalPrice = rentalPrice;
        this.rented = false; 
    }

    // Getters
    public String getLicensePlate() {
        return licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public boolean isRented() {
        return rented;
    }

    // Setters
    public void setRented(boolean rented) {
        this.rented = rented;
    }

    // Abstract method to get the type of vehicle
    public abstract String getVehicleType();

    // Method to display vehicle details
    public String displayDetails() {
        return String.format("Type: %s, License Plate: %s, Brand: %s, Model: %s, Rental Price: %.2f, Available: %s",
                getVehicleType(), licensePlate, brand, model, rentalPrice, !rented);
    }
}