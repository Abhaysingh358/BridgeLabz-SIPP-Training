package Collectors;

import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    String gradeLevel;

    Student(String name, String gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
    }
}

public class StudentGrouping {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Aman", "Grade 10"),
            new Student("Neha", "Grade 10"),
            new Student("Ravi", "Grade 11"),
            new Student("Priya", "Grade 11"),
            new Student("Arjun", "Grade 12")
        );

        Map<String, List<String>> grouped = students.stream()
            .collect(Collectors.groupingBy(
                s -> s.gradeLevel,
                Collectors.mapping(s -> s.name, Collectors.toList())
            ));

        System.out.println(grouped);
    }
}
