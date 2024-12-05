package bankapp;

import java.util.Scanner;

public class App {
    private Bank bank;
    private TransactionService transactionService;

    public App(Bank bank, TransactionService transactionService) {
        this.bank = bank;
        this.transactionService = transactionService;
    }

    public void addCustomer(Scanner scanner) {
        System.out.println("Enter customer ID:");
        String customerId = scanner.next();
        Customer customer = new Customer(customerId);
        bank.addCustomer(customer);
        System.out.println("Customer added");
    }

    public void viewTransactions() {
        for (Transaction transaction : transactionService.getAllTransactions()) {
            System.out.println("Transaction ID: " + transaction.getTransactionId() +
                    ", From Account: " + transaction.getFromAccountId() +
                    ", To Account: " + transaction.getToAccountId() +
                    ", Amount: " + transaction.getAmount());
        }
    }
}