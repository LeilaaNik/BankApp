package bankapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a customer with multiple accounts.
 */
public class Customer {
    private String customerId;
    private List<Account> accounts;

    /**
     * Constructs a Customer with the specified customer ID.
     *
     * @param customerId the customer ID
     */
    public Customer(String customerId) {
        this.customerId = customerId;
        this.accounts = new ArrayList<>();
    }

    /**
     * Returns the customer ID.
     *
     * @return the customer ID
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Adds an account to the customer.
     *
     * @param account the account to add
     */
    public void addAccount(Account account) {
        accounts.add(account);
    }

    /**
     * Returns the list of accounts.
     *
     * @return the list of accounts
     */
    public List<Account> getAccounts() {
        return accounts;
    }
}