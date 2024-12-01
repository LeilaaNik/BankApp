package bankapp;

/**
 * Represents a bank account with an account ID and balance.
 */
public class Account {
    private String accountId;
    private double balance;

    /**
     * Constructs an Account with the specified account ID.
     *
     * @param accountId the account ID
     */
    public Account(String accountId) {
        this.accountId = accountId;
        this.balance = 0.0;
    }

    /**
     * Returns the account ID.
     *
     * @return the account ID
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Returns the balance of the account.
     *
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }
}