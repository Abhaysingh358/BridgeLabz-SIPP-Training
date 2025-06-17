package Arrays;
import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int[] digits = new int[20];
        int index = 0;

        while (temp != 0) {
            digits[index++] = temp % 10;
            temp /= 10;
        }

       
        int[] freq = new int[10];
        for (int i = 0; i < index; i++) {
            freq[digits[i]]++;
        }

        System.out.println("\nDigit Frequencies in number " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + ": " + freq[i] + " time(s)");
            }
        }

        sc.close();
    }
}
