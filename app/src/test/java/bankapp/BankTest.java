package bankapp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;

public class BankTest {
    private Bank bank;
    private Customer customer;
    private Account account1;
    private Account account2;

    @Before
    public void setUp() {
        bank = new Bank();
        customer = mock(Customer.class);
        account1 = mock(Account.class);
        account2 = mock(Account.class);

        when(customer.getCustomerId()).thenReturn("cust1");
        when(account1.getAccountId()).thenReturn("acc1");
        when(account2.getAccountId()).thenReturn("acc2");

        bank.addCustomer(customer);
        when(customer.getAccounts()).thenReturn(Arrays.asList(account1, account2));
    }

    @Test
    public void testAddCustomer() {
        Customer newCustomer = new Customer("cust2");
        bank.addCustomer(newCustomer);
        assertEquals(newCustomer, bank.getCustomer("cust2"));
    }

    @Test
    public void testTransfer() {
        when(account1.getBalance()).thenReturn(100.0);
        bank.transfer(account1, account2, 50.0);
        verify(account1).withdraw(50.0);
        verify(account2).deposit(50.0);
    }
}