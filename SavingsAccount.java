import java.util.*;
class SavingsAccount {
    private double savingsBalance;
    static double annualInterestRate;

    SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    void calculateMonthlyInterest() {
        savingsBalance += (savingsBalance * annualInterestRate) / 12;
    }

    void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    public static void main(String s[]) {
        SavingsAccount.modifyInterestRate(0.04);
        SavingsAccount s = new SavingsAccount(2000);
        s.calculateMonthlyInterest();
        System.out.println("Savings Balance: " + s.savingsBalance);
    }
}


