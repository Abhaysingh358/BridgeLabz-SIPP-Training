package Inheritence;

import java.time.LocalDate;

class Order {
    protected String orderId;
    protected LocalDate orderDate;

    public Order(String orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}

class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(String orderId, LocalDate orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped with tracking number: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    private LocalDate deliveryDate;

    public DeliveredOrder(String orderId, LocalDate orderDate, String trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}

public class RetailOrderSystem {
    public static void main(String[] args) {
        Order order = new Order("ORD001", LocalDate.of(2025, 7, 1));
        ShippedOrder shipped = new ShippedOrder("ORD002", LocalDate.of(2025, 7, 1), "TRACK123");
        DeliveredOrder delivered = new DeliveredOrder("ORD003", LocalDate.of(2025, 7, 1), "TRACK456", LocalDate.of(2025, 7, 3));

        System.out.println(order.getOrderStatus());
        System.out.println(shipped.getOrderStatus());
        System.out.println(delivered.getOrderStatus());
    }
}
