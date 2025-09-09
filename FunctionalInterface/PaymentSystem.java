package FunctionalInterface;

interface PaymentProcessor {
    void processPayment(double amount);

    default void refund(double amount) {
        System.out.println("Refunding ₹" + amount);
    }
}

class PayPal implements PaymentProcessor {
    public void processPayment(double amount) { System.out.println("PayPal payment Rs." + amount); }
}

public class PaymentSystem {
    public static void main(String[] args) {
        PaymentProcessor pp = new PayPal();
        pp.processPayment(1000);
        pp.refund(500);
    }
}
