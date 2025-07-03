package AbstractPolymorphismEncapsulation;

import java.util.*;

// Interface
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract Class
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Encapsulation
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    protected String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    public abstract double calculateRentalCost(int days);

    public void displayInfo() {
        System.out.println("Vehicle No: " + vehicleNumber + ", Type: " + type + ", Rate: " + rentalRate);
    }
}

// Subclasses
class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate, policyNumber);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.15;
    }

    public String getInsuranceDetails() {
        return "Insurance Policy: " + getInsurancePolicyNumber();
    }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate, policyNumber);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9; // 10% discount
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.08;
    }

    public String getInsuranceDetails() {
        return "Insurance Policy: " + getInsurancePolicyNumber();
    }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate, policyNumber);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500; // Extra charge
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.2;
    }

    public String getInsuranceDetails() {
        return "Insurance Policy: " + getInsurancePolicyNumber();
    }
}

// Main class to test polymorphism
public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> rentals = new ArrayList<>();

        rentals.add(new Car("CAR101", 1500, "CAR-POL-001"));
        rentals.add(new Bike("BIKE202", 500, "BIKE-POL-002"));
        rentals.add(new Truck("TRK303", 3000, "TRK-POL-003"));

        int days = 5;

        for (Vehicle v : rentals) {
            v.displayInfo();
            System.out.println("Rental for " + days + " days: ₹" + v.calculateRentalCost(days));

            if (v instanceof Insurable) {
                Insurable i = (Insurable) v;
                System.out.println("Insurance: ₹" + i.calculateInsurance());
                System.out.println(i.getInsuranceDetails());
            }

            System.out.println("------------------------");
        }
    }
}
