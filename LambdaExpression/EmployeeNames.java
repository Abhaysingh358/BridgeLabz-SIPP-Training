package LambdaExpression;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeNames {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Abhay", "Neha", "Ravi");

        List<String> upperCaseNames = employees.stream()
                                               .map(String::toUpperCase)
                                               .collect(Collectors.toList());

        System.out.println("Uppercase Names: " + upperCaseNames);
    }
}
