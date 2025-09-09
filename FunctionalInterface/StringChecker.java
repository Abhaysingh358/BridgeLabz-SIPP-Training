package FunctionalInterface;

import java.util.function.Function;

public class StringChecker {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunc = String::length;

        String msg = "Hello World!";
        System.out.println("Message length = " + lengthFunc.apply(msg));
    }
}

