package bankapp;

import java.util.HashMap;
import java.util.Map;

/**
 * Manages customers and their accounts.
 */
public class Bank {
    private Map<String, Customer> customers;

    /**
     * Constructs a Bank.
     */
    public Bank() {
        this.customers = new HashMap<>();
    }

    /**
     * Adds a customer to the bank.
     *
     * @param customer the customer to add
     */
    public void addCustomer(Customer customer) {
        customers.put(customer.getCustomerId(), customer);
    }

    /**
     * Returns the customer with the specified ID.
     *
     * @param customerId the customer ID
     * @return the customer
     */
    public Customer getCustomer(String customerId) {
        return customers.get(customerId);
    }

    /**
     * Transfers money between accounts.
     *
     * @param fromAccountId the ID of the account to transfer from
     * @param toAccountId the ID of the account to transfer to
     * @param amount the amount to transfer
     */
    public void transfer(String fromAccountId, String toAccountId, double amount) {
        for (Customer customer : customers.values()) {
            for (Account account : customer.getAccounts()) {
                if (account.getAccountId().equals(fromAccountId)) {
                    account.withdraw(amount);
                }
                if (account.getAccountId().equals(toAccountId)) {
                    account.deposit(amount);
                }
            }
        }
    }
}