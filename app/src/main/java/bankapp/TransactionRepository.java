package bankapp;

import java.util.List;

/**
 * Represents a repository of transactions.
 */
public interface TransactionRepository {
    void save(Transaction transaction);
    Transaction findById(String transactionId);
    List<Transaction> findAll();
}