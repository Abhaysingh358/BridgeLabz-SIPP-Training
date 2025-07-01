package Constructors;

public class CarRental {
    // Attributes
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
        this.dailyRate = 1000.0; // Default rate per day
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = 1000.0; // You can customize this rate per car if needed
    }

    // Method to calculate total rental cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // toString() method to display rental details
    @Override
    public String toString() {
        return "Customer Name: " + customerName + "\n"
             + "Car Model: " + carModel + "\n"
             + "Rental Days: " + rentalDays + "\n"
             + "Total Cost: ₹" + calculateTotalCost();
    }

    // Main method to test the class
    public static void main(String[] args) {
        CarRental rental1 = new CarRental("Abhay Singh", "Honda City", 5);
        System.out.println(rental1);

        System.out.println("\n---");

        CarRental rental2 = new CarRental();
        System.out.println(rental2);
    }
}
