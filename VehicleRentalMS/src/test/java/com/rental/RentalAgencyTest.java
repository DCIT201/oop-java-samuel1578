package test.java.com.rental;

import com.rental.model.Car;
import com.rental.model.Customer;
import com.rental.service.RentalAgency;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertio@Test
public void testRentVehicle() {
    RentalAgency agency = new RentalAgency();
    Car car = new Car("XYZ789", "Honda Accord", 4);
    Customer customer = new Customer("Jane Doe", "0987654321");

    agency.addVehicle(car);
    agency.rentVehicle(customer, car, 3);
    assertTrue(agency.getAvailableVehicles().isEmpty(), "The available vehicles list should be empty after renting a vehicle");
    assertTrue(agency.getRentedVehicles().contains(car), "The rented vehicles list should contain the rented vehicle");
    assertTrue(car.isRented(), "The vehicle should be marked as rented");
}ns.assertTrue;

public class RentalAgencyTest {
    @Test
    public void testRentVehicle() {
        RentalAgency agency = new RentalAgency();
        Car car = new Car("XYZ789", "Honda Accord", 4);
        Customer customer = new Customer("Jane Doe", "0987654321");

        agency.addVehicle(car);
        agency.rentVehicle(customer, car, 3);
        assertTrue(agency.getAvailableVehicles().isEmpty(), "The available vehicles list should be empty after renting a vehicle");
    }
}