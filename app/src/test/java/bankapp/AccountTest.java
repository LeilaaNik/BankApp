package bankapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {
    @Test
    public void testGetAccountId() {
        Account account = new Account("123");
        assertEquals("123", account.getAccountId());
    }

    @Test
    public void testGetBalance() {
        Account account = new Account("123");
        assertEquals(0.0, account.getBalance(), 0.01);
    }

    @Test
    public void testDeposit() {
        Account account = new Account("123");
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdraw() {
        Account account = new Account("123");
        account.deposit(100.0);
        account.withdraw(50.0);
        assertEquals(50.0, account.getBalance(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawInvalidAmount() {
        Account account = new Account("123");
        account.withdraw(-10.0); // Negative amount should throw exception
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawInsufficientFunds() {
        Account account = new Account("123");
        account.withdraw(10.0); // Withdrawing more than balance should throw exception
    }
}