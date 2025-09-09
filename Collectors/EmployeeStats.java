package Collectors;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    String getDepartment() { return department; }
    double getSalary() { return salary; }
}

public class EmployeeStats {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Aman", "IT", 60000),
            new Employee("Neha", "IT", 70000),
            new Employee("Ravi", "HR", 50000),
            new Employee("Priya", "Finance", 80000),
            new Employee("Arjun", "Finance", 90000)
        );

        Map<String, Double> avgSalaryByDept = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)
            ));

        System.out.println(avgSalaryByDept);
    }
}

