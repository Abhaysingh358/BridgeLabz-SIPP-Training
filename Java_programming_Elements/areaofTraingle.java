package Java_programming_Elements;
import java.util.Scanner;
public class areaofTraingle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base = sc.nextDouble();
		double height = sc.nextDouble();
		double area = (base*height)*0.5;
		System.out.print("Area " +  area);
	}
}