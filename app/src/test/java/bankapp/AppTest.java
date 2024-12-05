package bankapp;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class AppTest {
    private Bank bank;
    private TransactionService transactionService;
    private App app;

    @Before
    public void setUp() {
        bank = mock(Bank.class);
        transactionService = mock(TransactionService.class);
        app = new App(bank, transactionService);
    }

    @Test
    public void testAddCustomer() {
        String input = "cust1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        app.addCustomer(scanner);
        verify(bank).addCustomer(any(Customer.class));
    }

    @Test
    public void testViewTransactions() {
        app.viewTransactions();
        verify(transactionService).getAllTransactions();
    }

    @Test
    public void testStart() {
        String input = "1\ncust1\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        app.start();
        verify(bank).addCustomer(any(Customer.class));
    }
}