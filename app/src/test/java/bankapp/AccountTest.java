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
}