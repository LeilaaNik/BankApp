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
}