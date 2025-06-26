package classAndObject;
import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotal() {
        return price * quantity;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CartItem[] cart = new CartItem[10]; // max 10 items
        int count = 0;

        while (true) {
            System.out.println("\n1.Add 2.Remove 3.Total 0.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    if (count >= 10) {
                        System.out.println("Cart full!");
                        break;
                    }
                    System.out.print("Item name: ");
                    String name = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();
                    cart[count++] = new CartItem(name, price, qty);
                    System.out.println("Item added.");
                    break;

                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeName = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (cart[i].itemName.equalsIgnoreCase(removeName)) {
                            // Shift left
                            for (int j = i; j < count - 1; j++) {
                                cart[j] = cart[j + 1];
                            }
                            cart[--count] = null;
                            found = true;
                            System.out.println("Item removed.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Item not found.");
                    }
                    break;

                case 3:
                    double total = 0;
                    for (int i = 0; i < count; i++) {
                        total += cart[i].getTotal();
                    }
                    System.out.println("Total Cost: ₹" + total);
                    break;

                case 0:
                    System.out.println("Exit");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
