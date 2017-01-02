package testCode;

/**
  A bank account has a blance that can be changed by deposits and withdrawals
 * Created by lulu on 12/29/16.
 */
public class BankAccount {
    private double balance;
    /**
     * Constructs a bank account with a zero balance.
     */
    public BankAccount(){
        balance = 0;
    }

    /**
     * Construcs a bank account with a given balance;
     * @param initialBalance the initial balance;
     */
    public BankAccount(double initialBalance){
        balance = initialBalance;
    }

    /**
     * Deposits money into the bank account.
     * @param amount the amount to deposit
     */
    public void deposit(double amount){
        balance = balance + amount;
    }

    /**
     * Withdraws money from the bank account.
     * @param amount the amount ot withdraw
     */
    public double withdraw(double amount){
        balance = balance - amount;
        return amount;
       // amount = 0;
    }

    /**
     * Get the current balance of the bank account.
     * @return the current balance
     */
    public double getBalance(){
        return balance;
    }
}
