import java.util.Random;

public class BankAccount {

    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts = 0;
    private static double totalMoneyStored = 0;

    // constructor
    public BankAccount() {
        numberOfAccounts++;

    }

    // Getters/Setters
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    // Order methods
    public String deposit(String account, double amount) {
        if (account.equals("checkingBalance")) {
            this.checkingBalance = this.checkingBalance + amount;
            totalMoneyStored = totalMoneyStored + amount;
        } else {
            this.savingsBalance = this.savingsBalance + amount;
            totalMoneyStored = totalMoneyStored + amount;
        }
        return "You have deposited :" + amount + "into" + account;
    }

    public String withdraw(String account, double amount) {
        if (account.equals("checkingBalance")) {
            if (this.checkingBalance == 0) {
                return "Insuffcient Funds";
            }else
        {
            this.checkingBalance = this.checkingBalance - amount;
            totalMoneyStored = totalMoneyStored - amount;
                return String.format("you took %f out your checking account", amount);
        }
    }else{
        if (this.savingsBalance == 0) {
            return "Insuffcient Funds";
        }else
    {
        this.savingsBalance = this.savingsBalance - amount;
        totalMoneyStored = totalMoneyStored - amount;
            return String.format("you took %f out your savings account", amount);
    }
    }
        
    }

    public void displayBalances() {
        System.out.println("Checking Balance :" + this.checkingBalance);
        System.out.println("Savings Balance ;" + this.savingsBalance);
    }
}