package Reflections;

import java.lang.reflect.Field;

class person {
    private int age = 25; // private field
}

public class AccessPrivateField {
    public static void main(String[] args) throws Exception {
        Person p = new Person();

        Field ageField = person.class.getDeclaredField("age");
        ageField.setAccessible(true); // bypass private access

        // Modify
        ageField.set(p, 40);

        // Retrieve
        int value = (int) ageField.get(p);
        System.out.println("Modified Age = " + value);
    }
}

