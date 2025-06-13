package Java_programming_Elements;
import java.util.Scanner;
 public class Height_measurement{
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the height in feet");
		 double feet = sc.nextDouble();
		 double inches = feet*12;
		 double cms = feet*12*2.54;
		 System.out.print("Your Height in cm is " + cms + " while in feet is " + feet + " and inches is "
				 + inches);
		 
	 }
 }