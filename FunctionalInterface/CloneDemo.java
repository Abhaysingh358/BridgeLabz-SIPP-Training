package FunctionalInterface;

class Prototype implements Cloneable {
    String model;

    Prototype(String model) { this.model = model; }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p1 = new Prototype("X-Model");
        Prototype p2 = (Prototype) p1.clone();
        System.out.println("Cloned Object: " + p2.model);
    }
}

