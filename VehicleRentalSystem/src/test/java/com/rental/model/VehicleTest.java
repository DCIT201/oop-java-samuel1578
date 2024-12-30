package test.java.com.rental.model;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    void testVehicleCreation() ```java
    {
        Vehicle car = new Car("ABC123", "Toyota", "Corolla", 50.0, 4);
        assertEquals("ABC123", car.getLicensePlate());
        assertEquals("Toyota", car.getBrand());
        assertEquals("Corolla", car.getModel());
        assertEquals(50.0, car.getRentalPrice());
        assertEquals("Car", car.getVehicleType());
    }
}
