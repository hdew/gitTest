package testCode;
import practiceCode.ch3.bankAcct.BankAccount;
import practiceCode.ch4.Counter.Counter;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Created by lulu on 12/25/16.
 */
public class testMain {
    public static void main(String[] args) {
        // System.out.println("Hello, Luluyellow!");
        String river = "Mississippi";
        System.out.println(river.replace("issipp", "our"));
        String greeting = "Hello";
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting);

        String greeting2 = greeting;
        System.out.println(greeting2.toUpperCase());
        System.out.println(greeting);

        Counter counter = new Counter();
        counter.click();
        counter.click();
        counter.click();
        System.out.println(counter.getValue());

        BankAccount account = new BankAccount();
        account.withdraw(100);


        // Test for CashRegister Class
        //CashRegister register = new CashRegister();
        //register.recordPurchase(29.50);
        //register.recordPurchase(9.25);
        //register.receivePayment(50);
        //double change = register.giveChange();
        //System.out.println(change);
        //System.out.println("Expected: 11.25");


        CashRegister register = new CashRegister();

        register.recordPurchase(0.75);
        register.recordPurchase(1.50);
        register.receivePayment(2, 0, 5, 0, 0);
        System.out.print("Change: ");
        System.out.println(register.giveChange());
        System.out.println("Expected: 0.25");
        register.recordPurchase(2.25);
        register.recordPurchase(19.25);

        register.receivePayment(23, 2, 0, 0,
                0);
        System.out.print("Change: ");
        System.out.println(register.giveChange());
        System.out.println("Expected: 2.0");


        //Input output
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the unit price: ");
        double unitPrice = in.nextDouble(); int quantity = in.nextInt();


        //Logic test
        String country="USA";
        String state="AK";
        if (!(country.equals("USA") && !state.equals("AK") && !state.equals("HI"))) {
            Logger.getGlobal().info("Higher shipping"); }



    }
}



