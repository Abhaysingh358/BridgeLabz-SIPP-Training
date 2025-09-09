package Reflections;

class Student {
    String name;
    Student() {
        this.name = "Default Student";
    }
}

public class DynamicallyCreateObjects {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Student.class;

        // Create instance using Reflection
        Object obj = clazz.getDeclaredConstructor().newInstance();

        Student student = (Student) obj;
        System.out.println("Student object created: " + student.name);
    }
}
