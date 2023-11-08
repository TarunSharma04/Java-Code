import java.util.Scanner;

// BankAccount interface
interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
}

// CheckingAccount class implementing BankAccount interface
class CheckingAccount implements BankAccount {
    private double balance;

    public CheckingAccount() {
        balance = 0.0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount; // Add the deposit amount to the balance
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) { // Check if sufficient balance is available
            balance -= amount; // Deduct the withdrawal amount from the balance
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Insufficient balance"); // Display message for insufficient balance
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CheckingAccount account = new CheckingAccount(); // Create a CheckingAccount object

        System.out.print("Enter the amount to deposit: ");
        double depositAmount = scanner.nextDouble(); // Input deposit amount from user
        account.deposit(depositAmount); // Call deposit method on CheckingAccount object

        System.out.print("Enter the amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble(); // Input withdrawal amount from user
        account.withdraw(withdrawAmount); // Call withdraw method on CheckingAccount object

        scanner.close();
    }
}
