class BankAccount {
    void accountDetails() {
        System.out.println("This is a bank account.");
    }
}

class SavingsAccount extends BankAccount {
    void savingsFeatures() {
        System.out.println("Savings Account: Earns interest.");
    }
}

class CurrentAccount extends BankAccount {
    void currentFeatures() {
        System.out.println("Current Account: Suitable for businesses with no interest.");
    }
}

public class hierarchical_inheritance2{
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        CurrentAccount current = new CurrentAccount();

        System.out.println("Savings Account:");
        savings.accountDetails();
        savings.savingsFeatures();

        System.out.println("\nCurrent Account:");
        current.accountDetails();
        current.currentFeatures();
    }
}
