package IntelligentSalesDashboard;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

public class SalesDashboard {
    public static void main(String[] args) {
        // Mock data
        Map<String, List<Store>> cityToStoresMap = new HashMap<>();

        // Create items
        Item laptop = new Item("Laptop", 1200);
        Item phone = new Item("Phone", 800);
        Item headphones = new Item("Headphones", 150);
        Item tv = new Item("TV", 1000);
        Item smartwatch = new Item("Smartwatch", 300);
        Item keyboard = new Item("Keyboard", 100);
        Item mouse = new Item("Mouse", 50);
        Item monitor = new Item("Monitor", 400);
        Item tablet = new Item("Tablet", 600);
        Item speaker = new Item("Speaker", 200);
        Item charger = new Item("Charger", 40);
        Item backpack = new Item("Backpack", 70);

        // Customers
        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");
        Customer c3 = new Customer("Charlie");

        // Orders for Alice (>= 3 orders in last 60 days)
        Order o1 = new Order(LocalDate.now().minusDays(10), Arrays.asList(laptop, mouse));
        Order o2 = new Order(LocalDate.now().minusDays(20), Arrays.asList(phone, charger));
        Order o3 = new Order(LocalDate.now().minusDays(30), Arrays.asList(headphones, smartwatch));

        // Orders for Bob (only 2 orders, not qualified)
        Order o4 = new Order(LocalDate.now().minusDays(5), Arrays.asList(tv, speaker));
        Order o5 = new Order(LocalDate.now().minusDays(70), Arrays.asList(monitor)); // old order

        // Orders for Charlie (>= 3 orders)
        Order o6 = new Order(LocalDate.now().minusDays(15), Arrays.asList(tablet, keyboard));
        Order o7 = new Order(LocalDate.now().minusDays(25), Arrays.asList(laptop, backpack));
        Order o8 = new Order(LocalDate.now().minusDays(50), Arrays.asList(phone, charger));

        // Store setup
        Store store1 = new Store();
        store1.customerOrders.put(c1, Arrays.asList(o1, o2, o3));
        store1.customerOrders.put(c2, Arrays.asList(o4, o5));

        Store store2 = new Store();
        store2.customerOrders.put(c3, Arrays.asList(o6, o7, o8));

        // City setup
        cityToStoresMap.put("New York", Arrays.asList(store1));
        cityToStoresMap.put("Los Angeles", Arrays.asList(store2));

        // Processing pipeline
        List<Item> topAffordablePicks = cityToStoresMap.values().stream()
            .flatMap(List::stream) // all stores
            .flatMap(store -> store.customerOrders.entrySet().stream())
            .filter(entry -> entry.getValue().stream()
                .filter(order -> order.orderDate.isAfter(LocalDate.now().minusDays(60)))
                .count() >= 3
            )
            .flatMap(entry -> entry.getValue().stream()) // all orders
            .flatMap(order -> order.items.stream()) // all items
            .collect(Collectors.toMap(
                Item::getName,
                item -> item,
                (item1, item2) -> item1 // remove duplicates
            ))
            .values().stream()
            .sorted(Comparator.comparingDouble(Item::getPrice).reversed()) // sort desc by price
            .peek(item -> System.out.println("Flow: " + item.getName() + " - $" + item.getPrice()))
            .skip(2) // skip top 2 expensive
            .limit(10) // next 10
            .collect(Collectors.toList());

        System.out.println("\n--- Top Affordable Picks ---");
        topAffordablePicks.forEach(item ->
            System.out.println(item.getName() + " - $" + item.getPrice())
        );
    }
}

class Store {
    Map<Customer, List<Order>> customerOrders = new HashMap<>();
}

class Customer {
    String name;
    Customer(String name) { this.name = name; }
}

class Order {
    LocalDate orderDate;
    List<Item> items = new ArrayList<>();
    Order(LocalDate date, List<Item> items) {
        this.orderDate = date;
        this.items = items;
    }
}

class Item {
    String name;
    double price;
    public String getName() { return name; }
    public double getPrice() { return price; }
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

