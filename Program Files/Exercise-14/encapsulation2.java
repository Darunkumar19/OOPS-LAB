
import java.util.Scanner;

class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class encapsulation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        System.out.print("Enter deposit amount: ");
        account.deposit(sc.nextDouble());

        System.out.print("Enter withdrawal amount: ");
        account.withdraw(sc.nextDouble());

        System.out.println("Current Balance: " + account.getBalance());
    }
}
