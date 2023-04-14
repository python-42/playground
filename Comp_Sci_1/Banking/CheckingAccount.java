package Comp_Sci_1.Banking;

public class CheckingAccount extends BankAccount{
    private String accountType = "Checking";

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
