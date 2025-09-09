package Reflections;

import java.lang.reflect.Field;

class StudentWithGpa {
    String name = "Ravi";
    int rollNo = 101;
    double gpa = 8.5;
}

public class JsonGenerator {
    public static String toJson(Object obj) throws Exception {
        Class<?> clazz = obj.getClass();
        StringBuilder json = new StringBuilder("{");

        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            json.append("\"").append(fields[i].getName()).append("\": ");
            Object value = fields[i].get(obj);

            if (value instanceof String) {
                json.append("\"").append(value).append("\"");
            } else {
                json.append(value);
            }

            if (i < fields.length - 1) json.append(", ");
        }

        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) throws Exception {
        StudentWithGpa s = new StudentWithGpa();
        System.out.println(toJson(s));
    }
}
