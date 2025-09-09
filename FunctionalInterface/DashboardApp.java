package FunctionalInterface;

interface VehicleDashboard {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery info not available");
    }
}

class PetrolCar implements VehicleDashboard {
    public void displaySpeed() { System.out.println("Petrol Car Speed: 80 km/h"); }
}

class ElectricCar implements VehicleDashboard {
    public void displaySpeed() { System.out.println("EV Speed: 60 km/h"); }
    public void displayBattery() { System.out.println("Battery at 75%"); }
}

public class DashboardApp {
    public static void main(String[] args) {
        VehicleDashboard ev = new ElectricCar();
        VehicleDashboard petrol = new PetrolCar();

        ev.displaySpeed(); ev.displayBattery();
        petrol.displaySpeed(); petrol.displayBattery();
    }
}

