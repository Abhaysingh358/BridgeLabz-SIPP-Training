package Reflections;

import java.lang.reflect.Field;
import java.util.Map;

class PersonWithAge {
    String name;
    int age;
}

public class CustomObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();

        for (Map.Entry<String, Object> entry : properties.entrySet()) {
            try {
                Field field = clazz.getDeclaredField(entry.getKey());
                field.setAccessible(true);
                field.set(obj, entry.getValue());
            } catch (NoSuchFieldException e) {
                // Ignore fields not found in class
            }
        }
        return obj;
    }

    public static void main(String[] args) throws Exception {
        Map<String, Object> data = Map.of("name", "Abhay", "age", 25);

        PersonWithAge person = toObject(PersonWithAge.class, data);
        System.out.println("Person: " + person.name + ", Age: " + person.age);
    }
}

