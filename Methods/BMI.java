package Methods;
import java.util.Scanner;

public class BMI {

    public static void BMI(double height, double weight) {
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi <= 39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height in meters: ");
        double height = sc.nextDouble();
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();
        BMI(height, weight); 
    }
}
