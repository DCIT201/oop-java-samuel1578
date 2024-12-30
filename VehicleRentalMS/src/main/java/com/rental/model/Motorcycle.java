package main.java.com.rental.model;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String licensePlate, String model, boolean hasSidecar) {
        super(licensePlate, model);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public double getRentalPrice() {
        return 30.0; // Example fixed price for renting a motorcycle
    }

    @Override
    public String toString() {
        return super.toString() + ", Motorcycle{" +
                "hasSidecar=" + hasSidecar +
                '}';
    }
}
