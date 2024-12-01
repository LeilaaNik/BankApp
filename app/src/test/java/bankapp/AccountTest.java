package bankapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {
  @Test
    public void testGetAccountId() {
        Account account = new Account("123");
        assertEquals("123", account.getAccountId());
    }
}
