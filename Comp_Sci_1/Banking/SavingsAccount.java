package Comp_Sci_1.Banking;

public class SavingsAccount extends BankAccount{
    private String accountType = "Savings";

    public double calculateInterest() {
        return getBalance() * 0.005;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String toString() {
        return "Name: " + getName() + "\nAccount#: " + getAccountNumber() + " " + getAccountType() + "\nBalance: " + getBalance();
    }
}
