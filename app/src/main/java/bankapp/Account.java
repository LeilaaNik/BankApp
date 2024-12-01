package bankapp;

/**
 * Represents a bank account with an account ID.
 */
public class Account {
    private String accountId;

    /**
     * Constructs an Account with the specified account ID.
     *
     * @param accountId the account ID
     */
    public Account(String accountId) {
        this.accountId = accountId;
    }

    /**
     * Returns the account ID.
     *
     * @return the account ID
     */
    public String getAccountId() {
        return accountId;
    }
}