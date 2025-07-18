package Sorting;
import java.util.Scanner;

public class StudentAgeCountingSort {

    // Method to perform Counting Sort
    public static void countingSort(int[] ages) {
        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;

        int[] count = new int[range];      // To store count of each age
        int[] output = new int[ages.length]; // Output array

        // Step 1: Store frequency of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Step 2: Compute cumulative count
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Build the output array (stable sort)
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            int index = count[age - minAge] - 1;
            output[index] = age;
            count[age - minAge]--;
        }

        // Step 4: Copy sorted array back to original array
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = new int[n];
        System.out.println("Enter the ages of " + n + " students (between 10 and 18):");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        // Before sorting
        System.out.println("Ages before sorting:");
        printArray(ages);

        // Perform Counting Sort
        countingSort(ages);

        // After sorting
        System.out.println("Ages after sorting (Ascending Order):");
        printArray(ages);

        sc.close();
    }
}
