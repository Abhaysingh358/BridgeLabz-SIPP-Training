package Inheritence;

class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayCommonInfo() {
        System.out.println("Account Number: " + accountNumber + ", Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        displayCommonInfo();
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        displayCommonInfo();
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    private int durationInMonths;

    public FixedDepositAccount(String accountNumber, double balance, int durationInMonths) {
        super(accountNumber, balance);
        this.durationInMonths = durationInMonths;
    }

    public void displayAccountType() {
        displayCommonInfo();
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Duration: " + durationInMonths + " months");
    }
}

public class BankAccountHierarchy {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 15000, 4.5);
        CheckingAccount ca = new CheckingAccount("CA456", 10000, 5000);
        FixedDepositAccount fda = new FixedDepositAccount("FD789", 50000, 12);

        sa.displayAccountType();
        System.out.println();
        ca.displayAccountType();
        System.out.println();
        fda.displayAccountType();
    }
}
