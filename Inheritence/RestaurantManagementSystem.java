package Inheritence;

// Renamed superclass to avoid conflict with existing Person class
class RestaurantMember {
    protected String name;
    protected int id;

    public RestaurantMember(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

// Interface for hybrid behavior
interface Worker {
    void performDuties();
}

// Subclass: Chef
class Chef extends RestaurantMember implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        displayInfo();
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
        System.out.println("Duties: Prepare meals and manage kitchen.");
    }
}

// Subclass: Waiter
class Waiter extends RestaurantMember implements Worker {
    private int tableCount;

    public Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    @Override
    public void performDuties() {
        displayInfo();
        System.out.println("Role: Waiter");
        System.out.println("Assigned Tables: " + tableCount);
        System.out.println("Duties: Serve food and take orders.");
    }
}

// Main class
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Worker chef = new Chef("Rahul", 201, "Italian Cuisine");
        Worker waiter = new Waiter("Priya", 202, 5);

        chef.performDuties();
        System.out.println();
        waiter.performDuties();
    }
}
