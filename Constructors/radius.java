package Constructors;
import java.util.Scanner;
class Circle{
	private double radius;
	public Circle() {
		this(2.0);
	}
	public  Circle(double radius) {
		this.radius = radius;
		
	}
	public double  getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double circumference() {
		return 2*Math.PI * radius;
	}
	public void print() {
		System.out.println("deafault : " +  "\narea : " + getArea() + "\ncircumference : " + circumference());
		
	}
	
	
}
public class radius{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		Circle c1 = new Circle(radius);
		c1.print();
		
		Circle defaultCircle = new Circle();
		System.out.println("deafault : " +  "\narea : " + defaultCircle.getArea() + "\ncircumference : " + defaultCircle.circumference());
		
		
	}
}