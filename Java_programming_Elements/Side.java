package Java_programming_Elements;
import java.util.Scanner;
public class Side{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double perimeter = sc.nextDouble();
	double side = perimeter/4;
	System.out.println("Side of the squre" + side);
	
}
}