package bankapp;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class CustomerTest {
    @Test
    public void testGetCustomerId() {
        Customer customer = new Customer("cust1");
        assertEquals("cust1", customer.getCustomerId());
    }

    @Test
    public void testAddAccount() {
        Customer customer = new Customer("cust1");
        Account account = new Account("acc1");
        customer.addAccount(account);
        List<Account> accounts = customer.getAccounts();
        assertEquals(1, accounts.size());
        assertEquals("acc1", accounts.get(0).getAccountId());
    }
}