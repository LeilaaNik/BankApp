package bankapp;

import java.util.Scanner;

/**
 * The App class provides a simple console-based UI for managing customers and viewing transactions.
 */
public class App {
    private Bank bank;
    private TransactionService transactionService;

    /**
     * Constructs an App with the specified Bank and TransactionService.
     */
    public App(Bank bank, TransactionService transactionService) {
        this.bank = bank;
        this.transactionService = transactionService;
    }

    /**
     * Starts the console-based UI.
     */
    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Customer");
            System.out.println("2. View Transactions");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addCustomer(scanner);
                    break;
                case 2:
                    viewTransactions();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    /**
     * Adds a customer to the bank.
     */
    public void addCustomer(Scanner scanner) {
        System.out.println("Enter customer ID:");
        String customerId = scanner.next();
        Customer customer = new Customer(customerId);
        bank.addCustomer(customer);
        System.out.println("Customer added");
    }

    /**
     * Displays all transactions.
     */
    public void viewTransactions() {
        for (Transaction transaction : transactionService.getAllTransactions()) {
            System.out.println("Transaction ID: " + transaction.getTransactionId() +
                    ", From Account: " + transaction.getFromAccountId() +
                    ", To Account: " + transaction.getToAccountId() +
                    ", Amount: " + transaction.getAmount());
        }
    }
}