package HashMap;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class FindAllSubArrays {

    public static void main(String[] args) {
        // Take input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("All subarrays are:");
        printAllSubarrays(arr);

        System.out.println("Zero-sum subarrays:");
        zeroSumSubArrays(arr);

        sc.close();
    }

    // Method to print all subarrays
    public static void printAllSubarrays(int[] arr) {
        int n = arr.length;
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }

    // Method to find and print all zero-sum subarrays using HashMap
    public static void zeroSumSubArrays(int[] arr) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        map.put(0, new ArrayList<>());
        map.get(0).add(-1); // it will manage subarrays from start idx 0

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                for (int startIdx : map.get(sum)) {
                    System.out.print("SubArray [ from index " + (startIdx + 1) + " to " + i + " ]: ");
                    for (int j = startIdx + 1; j <= i; j++) {
                        System.out.print(arr[j] + " ");
                    }
                    System.out.println();
                }
            }
//            using a lambda function in case if key does not exist then it will return new ArrayList
            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
    }
}
