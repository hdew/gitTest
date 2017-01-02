package testCode;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by lulu on 12/30/16.
 */
public class InvestmentTest {
    public static void main(String[] args) {

        Logger.getGlobal().setLevel(Level.INFO);;
        //Logger.getGlobal().setLevel(Level.OFF);

        final double INITIAL_BALANCE = 10000;
        final double INTEREST_RATE = 5;
        final int YEARS = 20;

        Investment invest = new Investment(INITIAL_BALANCE, INTEREST_RATE);
        Investment invest1 = new Investment(INITIAL_BALANCE,INTEREST_RATE);

        invest.waitForBalance(2 * INITIAL_BALANCE);
        Logger.getGlobal().info("The final balance is: " + invest.getBalance());
        Logger.getGlobal().info("It takes " + invest.getYear() + " years to acheive this balance");

        invest1.waitYears(YEARS);
        Logger.getGlobal().info("The balance after " + YEARS + " is " + invest1.getBalance());

        double[] values = {1.0, 2.0, 4.5, 7};
        System.out.print(values[0]);
        for (int i = 1; i < values.length; i++) {
            System.out.print(", " + values[i]); }

    }
}
