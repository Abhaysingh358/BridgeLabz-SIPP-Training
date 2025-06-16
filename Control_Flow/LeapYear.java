package Control_Flow;
 import java.util.Scanner;
 
 public class LeapYear{
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int year = sc.nextInt();
		 if(year>1531) {
			 if(year%400==0) {
				 System.out.println("leap year");
			 }
			 else {
				 System.out.println("not a leap year");
			 }
		 }
	 }
 }