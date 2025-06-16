package Control_Flow;
import java.util.*;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n; 
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem * rem;
            n = n / 10;
        }

        if (original == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not an Armstrong");
        }
    }
}
