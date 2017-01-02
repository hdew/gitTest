package testCode;

/**
 * A class to monitor the growth of investment that accumulates interests at a fixed annual rate
 * Created by lulu on 12/30/16.
 */
public class Investment {
    private double balance;
    private double rate;
    private int year;

    /**
     * Construct an investment objects with a starting balance and a fixed annual rate
     * @param aBalance the starting balance in dollar
     * @param aInterest the interest rate in percent
     */
    public Investment(double aBalance, double aInterest){
        balance =  aBalance;
        rate = aInterest;
        year = 0;
    }

    /**
     * Keeps accumulating interest until a target bonus has been reached
     * @param targetBalance the target balance
     */
    public void waitForBalance(double targetBalance){
        while (balance < targetBalance){
            year++;
            double interest = rate * balance / 100;
            balance += interest;
        }
    }

    /**
     * Keeps accumulating interest for a given number of years
     * @param numOfYears the number of years to accumulate interest
     */
    public void waitYears(int numOfYears){
        for (int i = 1; i <= numOfYears; i++){
            balance = balance * (1 + rate / 100);
        }
        year = year + numOfYears;
    }

    /**
     * Gets the current investment balance
     * @return the current balance
     */
    public double getBalance(){
        return balance;
    }

    /**
     * Gets the number of years this investement has accumulated interest
     * @return the number of years
     */
    public int getYear(){
        return year;
    }


}
