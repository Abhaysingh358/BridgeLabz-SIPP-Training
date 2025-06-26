package classAndObject;
public class Employee {

    // Attributes
    private String name;
    private int id;
    private double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: ₹" + salary);
    }


    public static void main(String[] args) {
        // Creating an object of Employee
        Employee emp = new Employee("Abhay Singh", 101, 5000000.0);

        // Calling method to display details
        emp.displayDetails();
    }
}
