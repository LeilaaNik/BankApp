package bankapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {
    @Test
    public void testGetCustomerId() {
        Customer customer = new Customer("cust1");
        assertEquals("cust1", customer.getCustomerId());
    }
}