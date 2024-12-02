package bankapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class BankTest {
    @Test
    public void testAddCustomer() {
        Bank bank = new Bank();
        Customer customer = new Customer("cust1");
        bank.addCustomer(customer);
        assertEquals(customer, bank.getCustomer("cust1"));
    }
}