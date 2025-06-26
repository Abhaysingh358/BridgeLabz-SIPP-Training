package classAndObject;
import java.util.Scanner;

class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b1 = new BankAccount("Abhay", "ACC1001", 5000);

        int ch;
        do {
            System.out.println("\n1.Deposit 2.Withdraw 3.Balance 0.Exit");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Amount to deposit: ");
                    b1.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Amount to withdraw: ");
                    b1.withdraw(sc.nextDouble());
                    break;
                case 3:
                    b1.displayBalance();
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (ch != 0);

        sc.close();
    }
}
