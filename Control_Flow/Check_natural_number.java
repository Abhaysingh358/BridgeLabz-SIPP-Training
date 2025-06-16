package Control_Flow;
 import java.util.Scanner;
 public class Check_natural_number{
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n= sc.nextInt();
		 if(n<0) {
			 System.out.println("not a natural number");
		 }
		 else {
			 System.out.println("is a natural number");
		 }
	 }
 }