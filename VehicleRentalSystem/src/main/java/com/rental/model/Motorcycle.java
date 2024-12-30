package main.java.com.rental.model;


public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String licensePlate, String brand, String model, double rentalPrice, boolean hasSidecar) {
        super(licensePlate, brand, model, rentalPrice);
        this.hasSidecar = hasSidecar;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }

    @Override
    public String getVehicleType() {
        return "Motorcycle";
    }
}