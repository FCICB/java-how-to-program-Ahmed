import java.io.Serializable;

public class TransactionRecord implements Serializable
{
    private int accountNumber;
    private double transactionAmount;
    public TransactionRecord(){};
    public TransactionRecord(int accountNumber, double transactionAmount) {
        this.accountNumber = accountNumber;
        this.transactionAmount = transactionAmount;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getTransactionAmount() {
        return transactionAmount;
    }
    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    @Override
    public String toString() {
            return "Account Number: " + accountNumber + ", Transaction Amount: " + transactionAmount;
    }
}
