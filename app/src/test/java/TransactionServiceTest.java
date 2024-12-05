package bankapp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TransactionServiceTest {
    private TransactionService transactionService;
    private TransactionRepository transactionRepository;

    @Before
    public void setUp() {
        transactionRepository = mock(TransactionRepository.class);
        transactionService = new TransactionService(transactionRepository);
    }

    @Test
    public void testAddTransaction() {
        Transaction transaction = new Transaction("txn1", "acc1", "acc2", 100.0);
        transactionService.addTransaction(transaction);
        verify(transactionRepository).save(transaction);
    }
}