package classAndObject;

import java.util.Scanner;

class Item {
    int itemCode;
    String itemName;
    double price;

    // Constructor
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Display item details
    public void displayItem() {
        System.out.println("\nItem Details:");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Unit: ₹" + price);
    }

    
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class InventoryProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter Item Code: ");
        int code = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price per Unit: ");
        double price = sc.nextDouble();


        Item item = new Item(code, name, price);

        
        item.displayItem();


        System.out.print("\nEnter quantity to calculate total cost: ");
        int quantity = sc.nextInt();

       
        double total = item.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " units: ₹" + total);

        sc.close();
    }
}
