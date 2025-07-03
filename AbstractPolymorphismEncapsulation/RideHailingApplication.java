package AbstractPolymorphismEncapsulation;

import java.util.*;

// Interface for GPS functionality
interface GPSModule {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Abstract class for all rides
abstract class TransportUnit {
    private String unitId;
    private String operatorName;
    private double costPerKm;

    public TransportUnit(String unitId, String operatorName, double costPerKm) {
        this.unitId = unitId;
        this.operatorName = operatorName;
        this.costPerKm = costPerKm;
    }

    // Encapsulation
    public String getUnitId() {
        return unitId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public double getCostPerKm() {
        return costPerKm;
    }

    public void getVehicleDetails() {
        System.out.println("Unit ID: " + unitId + ", Operator: " + operatorName + ", Rate/km: ₹" + costPerKm);
    }

    public abstract double calculateFare(double distance);
}

// Sedan subclass
class SedanCab extends TransportUnit implements GPSModule {
    private String currentLocation;

    public SedanCab(String unitId, String operatorName, double costPerKm, String initialLocation) {
        super(unitId, operatorName, costPerKm);
        this.currentLocation = initialLocation;
    }

    public double calculateFare(double distance) {
        return getCostPerKm() * distance + 50; // includes base fare
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Motorbike subclass
class TwoWheelerRide extends TransportUnit implements GPSModule {
    private String currentLocation;

    public TwoWheelerRide(String unitId, String operatorName, double costPerKm, String initialLocation) {
        super(unitId, operatorName, costPerKm);
        this.currentLocation = initialLocation;
    }

    public double calculateFare(double distance) {
        return getCostPerKm() * distance;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Rickshaw subclass
class AutoRickshawRide extends TransportUnit implements GPSModule {
    private String currentLocation;

    public AutoRickshawRide(String unitId, String operatorName, double costPerKm, String initialLocation) {
        super(unitId, operatorName, costPerKm);
        this.currentLocation = initialLocation;
    }

    public double calculateFare(double distance) {
        return getCostPerKm() * distance + 20; // minimal base fare
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Main class
public class RideHailingApplication {
    public static void main(String[] args) {
        List<TransportUnit> rides = new ArrayList<>();

        TransportUnit ride1 = new SedanCab("CAB101", "Ravi Singh", 15.0, "Sector 21");
        TransportUnit ride2 = new TwoWheelerRide("BIKE102", "Priya Sharma", 7.5, "City Mall");
        TransportUnit ride3 = new AutoRickshawRide("AUTO103", "Amit Patel", 10.0, "Railway Station");

        rides.add(ride1);
        rides.add(ride2);
        rides.add(ride3);

        double distance = 8.5; // sample ride distance in km

        for (TransportUnit ride : rides) {
            ride.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: ₹" + ride.calculateFare(distance));
            if (ride instanceof GPSModule) {
                System.out.println("Current Location: " + ((GPSModule) ride).getCurrentLocation());
            }
            System.out.println("----------------------------------");
        }
    }
}
