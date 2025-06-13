package Java_programming_Elements;

import java.util.Scanner;

public class KmtoMiles{
	public static void main(String[] args) {
		System.out.println("enter the km");
		Scanner input = new Scanner(System.in);
		double km = input.nextDouble();
		double miles = km * 0.62;
		System.out.print("The total miles is " + miles + " mile for the given " + km + "km");
		
	}
}