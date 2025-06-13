package Java_programming_Elements;

import java.util.Scanner;

public class basic_operations{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int add = num1 + num2;
		int sub = num1-num2;
		int mult = num1*num2;
		int div = num1/num2;
		System.out.println("sum " + add + "  Sub " +  sub + " mult " +  mult +  " div " +  div);
	}
}