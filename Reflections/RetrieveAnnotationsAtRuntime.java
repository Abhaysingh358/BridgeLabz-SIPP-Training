package Reflections;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Annotation;

// Define custom annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

// Apply annotation
@Author(name = "Abhay Singh")
class Book {
    String title = "Reflection in Java";
}

public class RetrieveAnnotationsAtRuntime {
    public static void main(String[] args) {
        Class<Book> bookClass = Book.class;

        // Retrieve annotation
        if (bookClass.isAnnotationPresent(Author.class)) {
            Author author = bookClass.getAnnotation(Author.class);
            System.out.println("Author: " + author.name());
        }
    }
}

