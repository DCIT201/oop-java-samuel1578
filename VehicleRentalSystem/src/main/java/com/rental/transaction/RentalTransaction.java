package main.java.com.rental.transaction;

import main.java.com.rental.customer.Customer;
import main.java.com.rental.model.Vehicle;

import java.time.LocalDate;

public class RentalTransaction {
    private Customer customer;
    private Vehicle vehicle;
    private LocalDate rentalDate;
    private LocalDate returnDate;

    public RentalTransaction(Customer customer, Vehicle vehicle, LocalDate rentalDate, LocalDate returnDate) {
        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null.");
        }
        if (vehicle == null) {
            throw new IllegalArgumentException("Vehicle cannot be null.");
        }
        if (rentalDate == null || returnDate == null) {
            throw new IllegalArgumentException("Rental and return dates cannot be null.");
        }
        if (returnDate.isBefore(rentalDate)) {
            throw new IllegalArgumentException("Return date must be after rental date.");
        }
        if (vehicle.isRented()) {
            throw new IllegalStateException("Vehicle is already rented.");
        }

        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;

        // Mark the vehicle as rented
        vehicle.setRented(true);
    }

    public double calculateTotalCost() {
        long daysRented = java.time.temporal.ChronoUnit.DAYS.between(rentalDate, returnDate);
        return daysRented * vehicle.getRentalPrice();
    }

    public void displayTransactionDetails() {
        System.out.printf("Rental Transaction Details:%n");
        System.out.printf("Customer: %s (License: %s)%n", customer.getName(), customer.getLicenseNumber());
        System.out.printf("Vehicle: %s %s (%s)%n", vehicle.getBrand(), vehicle.getModel(), vehicle.getLicensePlate());
        System.out.printf("Rental Date: %s%n", rentalDate);
        System.out.printf("Return Date: %s%n", returnDate);
        System.out.printf("Total Cost: %.2f%n", calculateTotalCost());
    }

    // Optional: Method to finalize the transaction (e.g., when the vehicle is returned)
    public void finalizeTransaction() {
        vehicle.setRented(false);
        System.out.println("Transaction finalized. Vehicle is now available for rent.");
    }

    public Object getRentalDate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRentalDate'");
    }
}