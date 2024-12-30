package main.java.com.rental.agency;

import main.java.com.rental.model.Vehicle;
import main.java.com.rental.transaction.RentalTransaction;
import main.java.com.rental.customer.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentalAgency {
    private List<Vehicle> vehicles;
    private List<RentalTransaction> transactions;

    public RentalAgency() {
        vehicles = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<Vehicle> getAvailableVehicles() {
        return vehicles.stream()
                .filter(vehicle -> !vehicle.isRented())
                .collect(Collectors.toList());
    }

    public void displayAvailableVehicles() {
        List<Vehicle> availableVehicles = getAvailableVehicles();
        if (availableVehicles.isEmpty()) {
            System.out.println("No vehicles available for rent.");
            return;
        }

        System.out.println("Available Vehicles:");
        for (Vehicle vehicle : availableVehicles) {
            System.out.printf("Type: %s, License Plate: %s, Brand: %s, Model: %s, Rental Price: %.2f%n",
                    vehicle.getVehicleType(), vehicle.getLicensePlate(), vehicle.getBrand(),
                    vehicle.getModel(), vehicle.getRentalPrice());
        }
    }

    public void rentVehicle(Customer customer, String licensePlate) {
        Vehicle vehicle = findVehicleByLicensePlate(licensePlate);
        if (vehicle == null) {
            System.out.println("Vehicle not found.");
            return;
        }
        if (vehicle.isRented()) {
            System.out.println("Vehicle is already rented.");
            return;
        }

        vehicle.setRented(true);
        RentalTransaction transaction = new RentalTransaction(customer, vehicle, null, null);
        transactions.add(transaction);
        System.out.println("Vehicle rented successfully: " + vehicle.getModel());
    }

    public void returnVehicle(String licensePlate) {
        Vehicle vehicle = findVehicleByLicensePlate(licensePlate);
        if (vehicle == null) {
            System.out.println("Vehicle not found.");
            return;
        }
        if (!vehicle.isRented()) {
            System.out.println("Vehicle is not currently rented.");
            return;
        }

        vehicle.setRented(false);
        System.out.println("Vehicle returned successfully: " + vehicle.getModel());
    }

    private Vehicle findVehicleByLicensePlate(String licensePlate) {
        return vehicles.stream()
                .filter(v -> v.getLicensePlate().equals(licensePlate))
                .findFirst()
                .orElse(null);
    }

    public void searchVehicles(String query) {
        List<Vehicle> foundVehicles = vehicles.stream()
                .filter(v -> v.getBrand().toLowerCase().contains(query.toLowerCase()) ||
                             v.getModel().toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toList());

        if (foundVehicles.isEmpty()) {
            System.out.println("No vehicles found matching the query: " + query);
            return;
        }

        System.out.println("Search Results:");
        for (Vehicle vehicle : foundVehicles) {
            System.out.printf("Type: %s, License Plate: %s, Brand: %s, Model: %s, Rental Price: %.2f%n",
                    vehicle.getVehicleType(), vehicle.getLicensePlate(), vehicle.getBrand(),
                    vehicle.getModel(), vehicle.getRentalPrice());
        }
    }
}