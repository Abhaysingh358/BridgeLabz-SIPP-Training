package Constructors;

public class Vehicle {
    // Instance Variables
    private String ownerName;
    private String vehicleType;

    // Class Variable (shared among all vehicles)
    private static double registrationFee = 1500.00; // fixed fee for all

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance Method: Display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
        System.out.println("-----------------------------");
    }

    // Class Method: Update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method for demonstration
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Motorcycle");

        // Displaying initial vehicle details
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Updating registration fee using class method
        Vehicle.updateRegistrationFee(2000.00);

        // Displaying updated vehicle details
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
