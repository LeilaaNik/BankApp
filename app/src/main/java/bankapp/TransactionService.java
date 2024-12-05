package bankapp;

/**
 * Service class for managing transactions.
 */
public class TransactionService {
    private TransactionRepository transactionRepository;

    /**
     * Constructs a TransactionService with the specified TransactionRepository.
     *
     * @param transactionRepository the TransactionRepository to use
     */
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    /**
     * Adds a transaction to the repository.
     *
     * @param transaction the transaction to add
     */
    public void addTransaction(Transaction transaction) {
        transactionRepository.save(transaction);
    }
}