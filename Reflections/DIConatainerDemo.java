package Reflections;

import java.lang.annotation.*;
import java.lang.reflect.*;

// Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {}

// Service class
class DatabaseService {
    void connect() { System.out.println("Database Connected!"); }
}

// Client class
class UserService {
    @Inject
    private DatabaseService dbService;

    void useService() {
        dbService.connect();
        System.out.println("User service running...");
    }
}

// Simple DI Container
class DIContainer {
    public static void injectDependencies(Object obj) throws Exception {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                Object dependency = field.getType().getDeclaredConstructor().newInstance();
                field.set(obj, dependency);
            }
        }
    }
}

public class DIConatainerDemo {
    public static void main(String[] args) throws Exception {
        UserService userService = new UserService();
        DIContainer.injectDependencies(userService);

        userService.useService();
    }
}

