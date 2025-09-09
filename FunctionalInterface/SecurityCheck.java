package FunctionalInterface;

interface SensitiveData {} // custom marker interface

class BankDetails implements SensitiveData {
    String accountNumber = "1234-5678-9999";
}

public class SecurityCheck {
    public static void main(String[] args) {
        BankDetails bd = new BankDetails();

        if (bd instanceof SensitiveData) {
            System.out.println("This data should be encrypted!");
        }
    }
}

