package Constructors;
class ProductInventory {
    // Instance variables
    private String productName;
    private double price;

    // Class variable (shared among all instances)
    private static int totalProducts = 0;

    // Constructor to initialize product and increment total count
    public ProductInventory(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increase count when new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
    }

    // Class method to display total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}

//  Proper class with main method
public class product {
    public static void main(String[] args) {
        ProductInventory p1 = new ProductInventory("Laptop", 50000.0);
        ProductInventory p2 = new ProductInventory("Smartphone", 20000.0);
        ProductInventory p3 = new ProductInventory("Headphones", 3000.0);

        // Display details of each product
        p1.displayProductDetails();
        System.out.println();

        p2.displayProductDetails();
        System.out.println();

        p3.displayProductDetails();
        System.out.println();

        // Display total products created
        ProductInventory.displayTotalProducts();
    }
}