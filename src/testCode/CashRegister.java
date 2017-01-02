package testCode;

/**
 * Created by lulu on 12/29/16.
 */
public class CashRegister {
    // Constant
    public static final double QUARTER_VALUE = 0.25;
    public static final double DIME_VALUE = 0.1;
    public static final double NICKEL_VALUE = 0.05;
    public static final double PENNY_VALUE = 0.01;

    // Instance variables
    private double purchase;
    private double payment;

    // Constructor
    public CashRegister(){
        purchase = 0;
        payment = 0;
    }

    // Methods
    public void recordPurchase(double amount){
        purchase =  purchase + amount;
    }

    public void receivePayment(double amount){
        payment = payment + amount;
    }

    public double giveChange(){
        double change = payment - purchase;
        payment = 0;
        purchase = 0;
        return change;
    }

    /**
     * Processes the payment received from the customer.
     * @param dollars the number of dollars in the payment
     * @param quarters the number of quarters in the payment
     * @param dimes the number of dimes in the payment
     * @param nickels the number of nickels in the payment
     * @param pennies the number of pennies in the payment
     */
    public void receivePayment(int dollars, int quarters, int dimes, int nickels, int pennies){
        payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE
                + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
    }

}
