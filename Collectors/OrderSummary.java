package Collectors;

import java.util.*;
import java.util.stream.Collectors;

class Order {
    String customer;
    double amount;

    Order(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }
}

public class OrderSummary {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("Alice", 1200.50),
            new Order("Bob", 500.00),
            new Order("Alice", 800.00),
            new Order("Charlie", 1500.75)
        );

        Map<String, Double> revenueByCustomer = orders.stream()
            .collect(Collectors.groupingBy(
                o -> o.customer,
                Collectors.summingDouble(o -> o.amount)
            ));

        System.out.println(revenueByCustomer);
    }
}
