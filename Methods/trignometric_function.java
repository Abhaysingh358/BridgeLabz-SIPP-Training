package Methods;
import java.util.Scanner;

public class trignometric_function {

    public double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); 

        double[] results = new double[3];
        results[0] = Math.sin(radians);   
        results[1] = Math.cos(radians);   
        results[2] = Math.tan(radians);   

        return results;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        trignometric_function calc = new trignometric_function();
        double[] trigValues = calc.calculateTrigonometricFunctions(angle);

        System.out.printf("Sine(%.2f°) = %.4f\n", angle, trigValues[0]);
        System.out.printf("Cosine(%.2f°) = %.4f\n", angle, trigValues[1]);
        System.out.printf("Tangent(%.2f°) = %.4f\n", angle, trigValues[2]);
    }
}
