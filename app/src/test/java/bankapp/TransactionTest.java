package bankapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class TransactionTest {
    @Test
    public void testTransactionId() {
        Transaction transaction = new Transaction("txn1", null, null, 0.0);
        assertEquals("txn1", transaction.getTransactionId());
    }

    @Test
    public void testFromAccountId() {
        Transaction transaction = new Transaction("txn1", "acc1", null, 0.0);
        assertEquals("acc1", transaction.getFromAccountId());
    }
}