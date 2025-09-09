package Reflections;

import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
}

public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter method name (add, subtract, multiply): ");
        String methodName = sc.nextLine();

        MathOperations ops = new MathOperations();

        // Get method dynamically (all methods take 2 ints)
        Method method = MathOperations.class.getMethod(methodName, int.class, int.class);

        // Invoke dynamically
        Object result = method.invoke(ops, 10, 5);
        System.out.println("Result of " + methodName + " = " + result);
    }
}
