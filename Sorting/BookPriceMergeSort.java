package Sorting;
import java.util.Scanner;

public class BookPriceMergeSort {

    // Method to perform Merge Sort
    public static void mergeSort(int[] prices, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Recursively sort the left and right halves
            mergeSort(prices, left, mid);
            mergeSort(prices, mid + 1, right);

            // Merge the sorted halves
            merge(prices, left, mid, right);
        }
    }

    // Method to merge two sorted subarrays
    public static void merge(int[] prices, int left, int mid, int right) {
        // Find sizes of the two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            L[i] = prices[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = prices[mid + 1 + j];

        // Merge the temp arrays back into prices[left..right]
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                prices[k++] = L[i++];
            } else {
                prices[k++] = R[j++];
            }
        }

        // Copy remaining elements of L[] if any
        while (i < n1)
            prices[k++] = L[i++];

        // Copy remaining elements of R[] if any
        while (j < n2)
            prices[k++] = R[j++];
    }

    // Method to print the array
    public static void printArray(int[] prices) {
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter the prices of " + n + " books:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Before sorting
        System.out.println("Book prices before sorting:");
        printArray(prices);

        // Perform merge sort
        mergeSort(prices, 0, n - 1);

        // After sorting
        System.out.println("Book prices after sorting (Ascending Order):");
        printArray(prices);

        sc.close();
    }
}
