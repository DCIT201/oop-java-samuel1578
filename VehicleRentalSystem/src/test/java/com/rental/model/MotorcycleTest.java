package test.java.com.rental.model;

import main.java.com.rental.model.Motorcycle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {
    private Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        // Initialize a Motorcycle object before each test
        motorcycle = new Motorcycle("MOTO123", "Yamaha", "MT-07", 70.0, false);
    }

    @Test
    void testMotorcycleConstructor() {
        assertNotNull(motorcycle, "Motorcycle object should be created.");
                assertEquals("MOTO123", motorcycle.getLicensePlate(), "License plate should match.");
                assertEquals("Yamaha", motorcycle.getBrand(), "Brand should match.");
                assertEquals("MT-07", motorcycle.getModel(), "Model should match.");
                assertEquals(70.0, motorcycle.getRentalPrice(), "Rental price should match.");
                                assertFalse(motorcycle.hasSidecar(), "Motorcycle should not have a sidecar.");
                            }
                        
                            private void assertEquals(double d, double rentalPrice, String string2) {
                        // TODO Auto-generated method stub
                        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
                    }
                
                            private void assertNotNull(Motorcycle motorcycle2, String string) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'assertNotNull'");
            }
        
            @Test
    void testGetVehicleType() {
        assertEquals("Motorcycle", motorcycle.getVehicleType(), "Vehicle type should be 'Motorcycle'.");
            }
        
            private void assertEquals(String string, String vehicleType, String string2) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
            }
        
            @Test
    void testHasSidecar() {
        assertFalse(motorcycle.hasSidecar(), "Motorcycle should not have a sidecar.");
                
                Motorcycle motorcycleWithSidecar = new Motorcycle("MOTO456", "Harley-Davidson", "Sportster", 80.0, true);
                assertFalse(motorcycleWithSidecar.hasSidecar(), "Motorcycle should have a sidecar.");
            }
        
            private void assertFalse(boolean hasSidecar, String string) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'assertFalse'");
            }
}