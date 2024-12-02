package bankapp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BankTest {
    private Bank bank;
    private Customer customer;
    private Account account1;
    private Account account2;

    @Before
    public void setUp() {
        bank = new Bank();
        customer = new Customer("cust1");
        account1 = new Account("acc1");
        account2 = new Account("acc2");
        customer.addAccount(account1);
        customer.addAccount(account2);
        bank.addCustomer(customer);
    }

    @Test
    public void testAddCustomer() {
        Customer newCustomer = new Customer("cust2");
        bank.addCustomer(newCustomer);
        assertEquals(newCustomer, bank.getCustomer("cust2"));
    }

    @Test
    public void testTransfer() {
        account1.deposit(100.0);
        bank.transfer("acc1", "acc2", 50.0);
        assertEquals(50.0, account1.getBalance(), 0.01);
        assertEquals(50.0, account2.getBalance(), 0.01);
    }
}