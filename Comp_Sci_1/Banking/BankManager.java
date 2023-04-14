package Comp_Sci_1.Banking;

public class BankManager {
    public static void main(String args[]) {
        CheckingAccount jim = new CheckingAccount();
        jim.setName("Jimmy John");
        jim.setAccountNumber("123456");
        jim.deposit(1000);

        SavingsAccount anita = new SavingsAccount();
        anita.setName("Anita");
        anita.setAccountNumber("654321");
        anita.deposit(500);
        anita.deposit(anita.calculateInterest());

        System.out.println(jim);
        System.out.println();
        System.out.println(anita);

        System.out.println();
        System.out.println("Deposit to " + jim.getName() + "'s account.");
        jim.deposit(500);
        System.out.println("Withdraw from " + anita.getName() + "'s account");
        anita.withdraw(50);

        System.out.println();
        System.out.println(jim);
        System.out.println();
        System.out.println(anita);
    }
}
