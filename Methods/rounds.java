package Methods;
import java.util.Scanner;

public class rounds {

   
    public double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000; 
        double rounds = totalDistance / perimeter;
        return rounds;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter side 1 of the triangle (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of the triangle (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of the triangle (in meters): ");
        double side3 = sc.nextDouble();

       
        rounds ar = new rounds();
        double rounds = ar.calculateRounds(side1, side2, side3);

    
        System.out.printf("The athlete must complete %.2f rounds to run 5 km.%n", rounds);
    }
}
