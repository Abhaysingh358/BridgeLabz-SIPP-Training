package Methods;
import java.util.Scanner;

public class NaturalNumberSum {

    public int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive natural number.");
            return;
        }

        NaturalNumberSum obj = new NaturalNumberSum();
        int result = obj.findSum(number);

        System.out.println(result);
    }
}
