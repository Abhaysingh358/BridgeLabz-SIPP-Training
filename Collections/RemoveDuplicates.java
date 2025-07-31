package Collections;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.HashSet;
import java.util.ArrayList;

public class RemoveDuplicates {

    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> st = new HashSet<>();
        List<Integer> ls = new Vector<>();

        for (Integer i : list) {
            if (!st.contains(i)) {
                st.add(i);
                ls.add(i);
            }
        }

        return ls;
    }

    public static void main(String[] args) {
      
        List<Integer> input = new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4));
        System.out.println("Original ArrayList: " + input);

        
        List<Integer> vector = removeDuplicates(input);
        System.out.println("After Removing Duplicates (Stored in LinkedList): " + vector);
    }
}
