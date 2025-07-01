package Constructors;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person another) {
        this(another.name, another.age);
    }

    // Setter methods to modify the fields
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print() {
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}

public class PersonAttribute {
    public static void main(String[] args) {
        Person p1 = new Person("Abhay", 21);
        Person p2 = new Person(p1);

        // Modify the copy
        p2.setName("Sumit");
        p2.setAge(20);

        p1.print(); // Original
        p2.print(); // Copied and modified
    }
}
