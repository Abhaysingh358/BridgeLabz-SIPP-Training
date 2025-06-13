package Java_programming_Elements;

import java.util.Scanner;

public class QuotientAndReamiander{
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n1 = sc.nextInt();
		 int n2 = sc.nextInt();
		 int quotient = n1/n2;
		 int rem = n1%n2;
		 System.out.print("Quotient " + quotient + " remainder : " + rem);
	 }
 }