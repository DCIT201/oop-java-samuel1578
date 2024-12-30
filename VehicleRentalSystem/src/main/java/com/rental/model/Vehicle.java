package main.java.com.rental.model;


public abstract class Vehicle {
    private String licensePlate;
    private String brand;
    private String model;
    private double rentalPrice;

    public Vehicle(String licensePlate, String brand, String model, double rentalPrice) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.rentalPrice = rentalPrice;
    }

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

    public abstract String getVehicleType();

    public abstract String isRented();

    public abstract void setRented(boolean b);
}