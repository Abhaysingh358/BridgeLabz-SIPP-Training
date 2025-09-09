package Reflections;

import java.lang.reflect.Method;

class Calculator{
	private int add(int a , int b) {
		return a+b;
	}
	
}

public class ReflectionMethodExample {
	public static void main(String[] args) throws Exception {
	Calculator calc = new Calculator();
	Class<?> cls = calc.getClass();
	
//	Access private Method
	Method method = cls.getDeclaredMethod("add" , int.class, int.class);
	method.setAccessible(true);
	
//	invoke method dynamically
	int res  = (int)method.invoke(calc, 5,10);
	System.out.println("Result:" + res);
	
	}
	
}
