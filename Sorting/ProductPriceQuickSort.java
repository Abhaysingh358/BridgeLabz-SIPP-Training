package Sorting;

import java.util.Scanner;

public class ProductPriceQuickSort {

    // Method to perform Quick Sort
    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pi = partition(prices, low, high);

            // Recursively sort elements before and after partition
            quickSort(prices, low, pi - 1);
            quickSort(prices, pi + 1, high);
        }
    }

    // Method to partition the array
    public static int partition(int[] prices, int low, int high) {
        int pivot = prices[high]; // choosing last element as pivot
        int i = low - 1; // index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (prices[j] <= pivot) {
                i++;

                // Swap prices[i] and prices[j]
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // Swap prices[i+1] and pivot
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
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

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter the prices of " + n + " products:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Before sorting
        System.out.println("Product prices before sorting:");
        printArray(prices);

        // Perform Quick Sort
        quickSort(prices, 0, n - 1);

        // After sorting
        System.out.println("Product prices after sorting (Ascending Order):");
        printArray(prices);

        sc.close();
    }
}
