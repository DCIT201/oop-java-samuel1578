package test.java.com.rental.transaction;

import main.java.com.rental.customer.Customer;
import main.java.com.rental.model.Car;
import main.java.com.rental.transaction.RentalTransaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RentalTransactionTest {
    private Customer customer;
    private Car car;

    @BeforeEach
    void setUp() {
        customer = new Customer("John Doe", "D123456");
        car = new Car("LMN456", "Ford", "Focus", 40.0, 4);
    }

    @test.java.com.rental.agency.Test
    void testCalculateTotalCost() {
        RentalTransaction transaction = new RentalTransaction(customer, car, LocalDate.now(), LocalDate.now().plusDays(3));
        double totalCost = transaction.calculateTotalCost();
        assertEquals(120.0, totalCost, "Total cost should be calculated correctly for 3 days.");
            }
        
            private void assertEquals(double d, double totalCost, String string) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
            }
        
            @test.java.com.rental.agency.Test
    void testCalculateTotalCostForOneDay() {
        RentalTransaction transaction = new RentalTransaction(customer, car, LocalDate.now(), LocalDate.now().plusDays(1));
        double totalCost = transaction.calculateTotalCost();
        assertEquals(40.0, totalCost, "Total cost should be 40.0 for one day rental.");
    }

    @test.java.com.rental.agency.Test
    void testCalculateTotalCostForZeroDays() {
        RentalTransaction transaction = new RentalTransaction(customer, car, LocalDate.now(), LocalDate.now());
        double totalCost = transaction.calculateTotalCost();
        assertEquals(0.0, totalCost, "Total cost should be 0.0 for zero days rental.");
    }

    @test.java.com.rental.agency.Test
    void testInvalidReturnDate() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new RentalTransaction(customer, car, LocalDate.now(), LocalDate.now().minusDays(1));
        });
        assertEquals("Return date must be after rental date.", exception.getMessage());
            }
        
            private void assertEquals(String string, String message) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
            }
        
            @test.java.com.rental.agency.Test
    void testVehicleRentedStatus() {
        RentalTransaction transaction = new RentalTransaction(customer, car, LocalDate.now(), LocalDate.now().plusDays(3));
        assertEquals(car.isRented(), "Vehicle should be marked as rented after transaction creation.");
    }

    @test.java.com.rental.agency.Test
    void testFinalizeTransaction() {
        RentalTransaction transaction = new RentalTransaction(customer, car, LocalDate.now(), LocalDate.now().plusDays(3));
        transaction.finalizeTransaction();
        assertFalse(car.isRented(), "Vehicle should be marked as available after finalizing the transaction.");
            }
        
            private void assertFalse(String rented, String string) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'assertFalse'");
            }
}