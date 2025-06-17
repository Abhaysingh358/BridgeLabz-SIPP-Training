package Arrays;
import java.util.*;

public class LargestSecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

       
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

     
        while (number != 0 && index < maxDigit) {
            int digit = number % 10;
            digits[index++] = digit;
            number /= 10;
        }

        int largest = -1, secondLargest = -1;

        for (int i = 0; i < index; i++) {
            int d = digits[i];
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        System.out.print("Digits stored: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest digit: " + largest);
        System.out.println("Second largest digit: " + 
            (secondLargest == -1 ? "Not found" : secondLargest));

        sc.close();
    }
}
