package Collectors;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCounter {
    public static void main(String[] args) {
        String paragraph = "java stream api makes java programming easier stream api is powerful";

        Map<String, Long> wordCount = Stream.of(paragraph.split(" "))
            .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println(wordCount);
    }
}
