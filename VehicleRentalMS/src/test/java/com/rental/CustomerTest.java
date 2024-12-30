package test.java.com.rental;

import main.java.com.rental.model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    @Test
    public void testCustomerDetails() {
        Customer customer = new Customer("John Doe", "1234567890");
        assertEquals("John Doe", customer.getName(), "Customer name should be 'John Doe'");
        assertEquals("1234567890", customer.getPhoneNumber(), "Customer phone number should be '1234567890'");
    }
}