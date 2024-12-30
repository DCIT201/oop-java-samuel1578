package test.java.com.rental.model;

import main.java.com.rental.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    private Car car;

    @BeforeEach
    void setUp() {
        // Initialize a Car object before each test
        car = new Car("ABC123", "Toyota", "Corolla", 50.0, 4);
    }

    @Test
    void testCarConstructor() {
        assertNotNull(car, "Car object should be created.");
                assertEquals("ABC123", car.getLicensePlate(), "License plate should match.");
                                assertEquals("Toyota", car.getBrand(), "Brand should match.");
                                assertEquals("Corolla", car.getModel(), "Model should match.");
                                assertEquals(50.0, car.getRentalPrice(), "Rental price should match.");
                                                                assertEquals(4, car.getNumberOfDoors(), "Number of doors should match.");
                                                            }
                                                        
                                                            private void assertEquals(double d, double rentalPrice, String string2) {
                                        // TODO Auto-generated method stub
                                        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
                                    }
                                
                                                            private void assertEquals(String string, String licensePlate, String string2) {
                        // TODO Auto-generated method stub
                        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
                    }
                
                            private void assertNotNull(Car car2, String string) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'assertNotNull'");
            }
        
            @Test
    void testGetVehicleType() {
        assertEquals("Car", car.getVehicleType(), "Vehicle type should be 'Car'.");
    }

    @Test
    void testGetNumberOfDoors() {
        assertEquals(4, car.getNumberOfDoors(), "Number of doors should be 4.");
    }
}