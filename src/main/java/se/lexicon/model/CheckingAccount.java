package se.lexicon.model;

import se.lexicon.exception.ArgumentException;
import se.lexicon.exception.InsufficientFundsException;

public class CheckingAccount {
    private double balance;
    private int number;

    public CheckingAccount(int number) {
        this.number = number;
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        checkAmount(amount);
        if (amount <= balance){
            balance -= amount;
            System.out.println("Withdraw operation is done.");
        }else{
            double need = amount - balance;
            throw new InsufficientFundsException(need);
        }
    }

    public void deposit(double amount){
        if (number <= 100) throw new ArgumentException(CustomErrors.ACCOUNT_NOT_VALID);
        checkAmount(amount);
        balance += amount;
    }

    private void checkAmount(double amount){
        if (amount <= 0){
            throw new ArgumentException(CustomErrors.AMOUNT_NOT_VALID);
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }
}
