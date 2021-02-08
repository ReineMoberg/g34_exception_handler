package se.lexicon;


import se.lexicon.exception.ArgumentException;
import se.lexicon.exception.InsufficientFundsException;
import se.lexicon.model.CheckingAccount;

public class App {
    public static void main(String[] args) {

        CheckingAccount account = new CheckingAccount(101);
        try {
            System.out.println("-----------------------------------");
            System.out.println("Deposit $ 500...");
            account.deposit(500.00);
            System.out.println("Deposit Operation is done. Current Balance = " + account.getBalance());

            System.out.println("\nWithDrawing $ 100...");

            account.withdraw(100.00);
            System.out.println("Withdraw Operation is done. Current Balance = " + account.getBalance());

            account.withdraw(800.00);
            System.out.println("Withdraw Operation is done. Current Balance = " + account.getBalance());

        } catch (InsufficientFundsException | ArgumentException e) {
            System.out.println("Exception : " + e);
        }
    }
}
