package LambdaExpression;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HospitalApp {
    public static void main(String[] args) {
        List<String> alerts = Arrays.asList("Emergency", "Appointment Reminder", "Lab Report", "Billing");

        // User preference: show only critical alerts
        Predicate<String> criticalFilter = alert -> alert.equals("Emergency") || alert.equals("Lab Report");

        List<String> filtered = alerts.stream()
                                      .filter(criticalFilter)
                                      .collect(Collectors.toList());

        System.out.println("Filtered Alerts: " + filtered);
    }
}

