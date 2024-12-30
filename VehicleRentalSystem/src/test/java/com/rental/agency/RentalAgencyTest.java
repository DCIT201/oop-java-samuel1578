package test.java.com.rental.agency;

import main.java.com.rental.agency.RentalAgency;
import main.java.com.rental.model.Car;
import main.java.com.rental.model.Motorcycle;
import main.java.com.rental.model.Truck;
import main.java.com.rental.model.Vehicle;
import java.util.List;

class RentalAgencyTest {
    private RentalAgency agency;

    @BeforeEach
    void setUp() {
        agency = new RentalAgency();
    }

    @Test
    void testAddVehicle() {
        Car car = new Car("XYZ789", "Honda", "Civic", 60.0, 4);
        agency.addVehicle(car);
        List<Vehicle> availableVehicles = agency.getAvailableVehicles();
        assertEquals(1, availableVehicles.size());
                        assertEquals(car, availableVehicles.get(0));
                                            }
                                        
                                            private void assertEquals(Car car, Vehicle size) {
                                // TODO Auto-generated method stub
                                throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
                            }
                        
                                            private void assertEquals(int i, int size) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
            }
        
                    private void assertEquals(Truck truck, Vehicle size) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
            }
        
            @Test
    void testAddMultipleVehicles() {
        Car car1 = new Car("ABC123", "Toyota", "Corolla", 50.0, 4);
        Car car2 = new Car("XYZ789", "Honda", "Civic", 60.0, 4);
        agency.addVehicle(car1);
        agency.addVehicle(car2);
        List<Vehicle> availableVehicles = agency.getAvailableVehicles();
        assertEquals(2, availableVehicles.size(), null);
    }

    @Test
    void testGetAvailableVehiclesWhenNoneAdded() {
        List<Vehicle> availableVehicles = agency.getAvailableVehicles();
        assertEquals(availableVehicles.isEmpty(), "Expected no available vehicles.");
            }
        
            private void assertEquals(boolean empty, String string) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
            }
        
            @Test
    void testAddDuplicateVehicle() {
        Car car = new Car("XYZ789", "Honda", "Civic", 60.0, 4);
        agency.addVehicle(car);
        agency.addVehicle(car); // Adding the same vehicle again
        List<Vehicle> availableVehicles = agency.getAvailableVehicles();
        assertEquals(1, availableVehicles.size(), "Expected only one instance of the vehicle.");
    }

    @Test
    void testAddMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("MOTO123", "Yamaha", "MT-07", 70.0, false);
        agency.addVehicle(motorcycle);
        List<Vehicle> availableVehicles = agency.getAvailableVehicles();
        assertEquals(1, availableVehicles.size(), null);
                assertEquals(motorcycle, availableVehicles.get(0));
                    }
                
                    private void assertEquals(int i, int size, Object object) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
            }
        
                    private void assertEquals(Motorcycle motorcycle, Vehicle vehicle) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
            }
        
            @Test
    void testAddTruck() {
        Truck truck = new Truck("TRK456", "Ford", "F-150", 80.0, 1000.0);
        agency.addVehicle(truck);
        List<Vehicle> availableVehicles = agency.getAvailableVehicles();
        assertEquals(1, availableVehicles.size());
        assertEquals(truck, availableVehicles.get(0));
    }
}