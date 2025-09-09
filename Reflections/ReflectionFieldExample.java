package Reflections;

import java.lang.reflect.Field;

class Person{
	private String name = "Abhay";
	
}

public class ReflectionFieldExample {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Person person = new Person();
		Class<?> cls = person.getClass();
		
		Field field = cls.getDeclaredField("name");
		field.setAccessible(true);
		
		System.out.println(field.get(person));
		
		field.set(person, "Prakhar");
		System.out.println(field.get(person));
	
	}
}
