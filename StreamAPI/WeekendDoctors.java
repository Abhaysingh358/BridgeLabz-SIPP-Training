package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class WeekendDoctors {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr. Smith", "Cardiology", true),
                new Doctor("Dr. Adams", "Neurology", false),
                new Doctor("Dr. Clara", "Orthopedics", true),
                new Doctor("Dr. Bruce", "Pediatrics", true)
        );

        List<Doctor> weekendDoctors = doctors.stream()
                .filter(Doctor::isAvailableOnWeekend)
                .sorted(Comparator.comparing(Doctor::getSpecialty))
                .collect(Collectors.toList());

        System.out.println("Doctors Available on Weekends:");
        weekendDoctors.forEach(System.out::println);
    }

    static class Doctor {
        private String name;
        private String specialty;
        private boolean availableOnWeekend;

        public Doctor(String name, String specialty, boolean availableOnWeekend) {
            this.name = name;
            this.specialty = specialty;
            this.availableOnWeekend = availableOnWeekend;
        }

        public String getSpecialty() {
            return specialty;
        }

        public boolean isAvailableOnWeekend() {
            return availableOnWeekend;
        }

        @Override
        public String toString() {
            return name + " - " + specialty + " (Weekend: " + availableOnWeekend + ")";
        }
    }
}

