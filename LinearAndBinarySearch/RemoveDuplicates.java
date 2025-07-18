package LinearAndBinarySearch;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {

    // Method to remove duplicates while maintaining order
    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        
        for (char ch : input.toCharArray()) {
            
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        return result.toString();
    }

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        String noDuplicates = removeDuplicates(original);

        System.out.println("String after removing duplicates: " + noDuplicates);

        sc.close();
    }
}

