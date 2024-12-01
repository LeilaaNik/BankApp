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

    /**
     * Deposits the specified amount into the account.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Withdraws the specified amount from the account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Invalid withdraw amount");
        }
    }
}