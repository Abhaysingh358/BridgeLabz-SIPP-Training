package Inheritence;

// Superclass (renamed from Vehicle to avoid conflicts)
class BaseVehicle {
    protected String model;
    protected int maxSpeed;

    public BaseVehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface for refueling behavior
interface Refuelable {
    void refuel();
}

// ElectricVehicle subclass
class ElectricVehicle extends BaseVehicle {
    private int batteryPercentage;

    public ElectricVehicle(String model, int maxSpeed, int batteryPercentage) {
        super(model, maxSpeed);
        this.batteryPercentage = batteryPercentage;
    }

    public void charge() {
        System.out.println("Charging battery... Current charge: " + batteryPercentage + "%");
    }

    public void displayVehicle() {
        displayInfo();
        System.out.println("Type: Electric Vehicle");
        charge();
    }
}

// PetrolVehicle subclass implementing Refuelable (Hybrid Inheritance)
class PetrolVehicle extends BaseVehicle implements Refuelable {
    private double fuelLevel;

    public PetrolVehicle(String model, int maxSpeed, double fuelLevel) {
        super(model, maxSpeed);
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling... Current fuel level: " + fuelLevel + " liters");
    }

    public void displayVehicle() {
        displayInfo();
        System.out.println("Type: Petrol Vehicle");
        refuel();
    }
}

// Main class
public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 250, 85);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180, 30.5);

        ev.displayVehicle();
        System.out.println();
        pv.displayVehicle();
    }
}
