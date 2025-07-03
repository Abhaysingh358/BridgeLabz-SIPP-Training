package AbstractPolymorphismEncapsulation;

import java.util.*;

// Interface
interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}

// Abstract Class
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Encapsulation
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    protected void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: ₹" + price + ", Quantity: " + quantity);
    }

    public abstract double calculateTotalPrice();
}

// VegItem class
class VegItem extends FoodItem implements Discountable {
    private double discount = 0;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return total - (total * discount / 100);
    }

    public void applyDiscount(double percentage) {
        if (percentage >= 0 && percentage <= 100) {
            discount = percentage;
        }
    }

    public String getDiscountDetails() {
        return "Discount applied: " + discount + "%";
    }
}

// NonVegItem class
class NonVegItem extends FoodItem implements Discountable {
    private double discount = 0;
    private final double nonVegCharge = 20; // flat extra charge per item

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        double total = (getPrice() + nonVegCharge) * getQuantity();
        return total - (total * discount / 100);
    }

    public void applyDiscount(double percentage) {
        if (percentage >= 0 && percentage <= 100) {
            discount = percentage;
        }
    }

    public String getDiscountDetails() {
        return "Discount applied: " + discount + "% (includes ₹" + nonVegCharge + " non-veg surcharge per item)";
    }
}

// Main class
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> orderList = new ArrayList<>();

        FoodItem veg1 = new VegItem("Paneer Butter Masala", 250, 2);
        FoodItem nonVeg1 = new NonVegItem("Chicken Biryani", 300, 1);

        ((Discountable) veg1).applyDiscount(10); // 10% discount
        ((Discountable) nonVeg1).applyDiscount(5); // 5% discount

        orderList.add(veg1);
        orderList.add(nonVeg1);

        for (FoodItem item : orderList) {
            item.getItemDetails();
            if (item instanceof Discountable) {
                System.out.println(((Discountable) item).getDiscountDetails());
            }
            System.out.println("Total Price: ₹" + item.calculateTotalPrice());
            System.out.println("-----------------------------");
        }
    }
}
