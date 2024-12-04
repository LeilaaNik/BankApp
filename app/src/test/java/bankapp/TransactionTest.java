package bankapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class TransactionTest {
    @Test
    public void testTransactionCreation() {
        Transaction transaction = new Transaction("txn1", "acc1", "acc2", 100.0);
        assertEquals("txn1", transaction.getTransactionId());
        assertEquals("acc1", transaction.getFromAccountId());
        assertEquals("acc2", transaction.getToAccountId());
        assertEquals(100.0, transaction.getAmount(), 0.01);
    }
}