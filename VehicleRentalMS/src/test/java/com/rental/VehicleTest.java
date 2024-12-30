package test.java.com.rental;

import main.java.com.rental.model.Car;
import main.java.com.rental.model.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {
    @Test
    public void testCarRentalPrice() {
        Car car = new Car("ABC123", "Toyota Camry", 4);
        assertEquals(50.0, car.getRentalPrice(), "The rental price for the car should be 50.0");
            }
        
            private void assertEquals(double d, double rentalPrice, String string) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
            }
}