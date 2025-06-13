package Java_programming_Elements;

import java.util.Scanner;

public class distance1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double feet = sc.nextDouble();
		double yards = feet*3;
		double miles = 1760*yards;
		System.out.println("feet "+ feet + " yards " + yards + " miles " + miles);
		
	}
}