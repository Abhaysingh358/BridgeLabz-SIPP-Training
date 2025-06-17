package Arrays;
import java.util.*;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter height in meters: ");
            height[i] = sc.nextDouble();

            System.out.print("Enter weight in kg: ");
            weight[i] = sc.nextDouble();

            
            bmi[i] = weight[i] / (height[i] * height[i]);

            
            if (bmi[i] < 18.5)
                status[i] = "Underweight";
            else if (bmi[i] < 25)
                status[i] = "Normal weight";
            else if (bmi[i] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        
        System.out.println("\nBMI Report:");
        System.out.println("--------------------------------------------------");
        System.out.println("Person\tHeight(m)\tWeight(kg)\tBMI\tStatus");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                    i + 1, height[i], weight[i], bmi[i], status[i]);
        }

        sc.close();
    }
}
