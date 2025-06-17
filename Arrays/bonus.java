package Arrays;
import java.util.*;

public class bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2]; 
        double[] bonus = new double[10], newSal = new double[10];
        double totalBonus = 0, totalOld = 0, totalNew = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("\nEmployee " + (i + 1));
            do {
                System.out.print("Salary: ");
                data[i][0] = sc.nextDouble();
            } while (data[i][0] <= 0);

            do {
                System.out.print("Years: ");
                data[i][1] = sc.nextDouble();
            } while (data[i][1] < 0);

            bonus[i] = data[i][1] > 5 ? 0.05 * data[i][0] : 0.02 * data[i][0];
            newSal[i] = data[i][0] + bonus[i];

            totalBonus += bonus[i];
            totalOld += data[i][0];
            totalNew += newSal[i];
        }

        System.out.println("\nEmp\tOld\tYears\tBonus\tNew");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t%.1f\t%.2f\t%.2f\n",
                i + 1, data[i][0], data[i][1], bonus[i], newSal[i]);
        }

        System.out.printf("\nTotal Bonus: ₹%.2f\nOld Total: ₹%.2f\nNew Total: ₹%.2f\n",
                totalBonus, totalOld, totalNew);
    }
}
