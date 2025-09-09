package Reflections;

import java.lang.reflect.Method;

class calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class InvokePrivateMethod {
    public static void main(String[] args) throws Exception {
        calculator calc = new calculator();

        Method multiplyMethod = calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        multiplyMethod.setAccessible(true); // make private method accessible

        int result = (int) multiplyMethod.invoke(calc, 5, 6);
        System.out.println("Multiplication Result = " + result);
    }
}
