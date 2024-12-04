package bankapp;

/**
 * Represents a transaction between accounts.
 */
public class Transaction {
    private String transactionId;

    /**
     * Constructs a Transaction with the specified details.
     *
     * @param transactionId the transaction ID
     * @param fromAccountId the ID of the account to transfer from
     * @param toAccountId the ID of the account to transfer to
     * @param amount the amount to transfer
     */
    public Transaction(String transactionId, String fromAccountId, String toAccountId, double amount) {
        this.transactionId = transactionId;
    }

    /**
     * Returns the transaction ID.
     *
     * @return the transaction ID
     */
    public String getTransactionId() {
        return transactionId;
    }
}