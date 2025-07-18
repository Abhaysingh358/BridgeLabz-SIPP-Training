package LinearAndBinarySearch;

import java.util.Scanner;

public class reverseString {

    // Method to reverse the string
    public static String ReverseString(String input) {
       
        StringBuilder sb = new StringBuilder();
        sb.append(input);

        
        sb.reverse();

       
        return sb.toString();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String original = sc.nextLine();

        String reversed = ReverseString(original);

        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}
