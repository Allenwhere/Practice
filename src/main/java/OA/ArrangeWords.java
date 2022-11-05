package OA;

import java.util.Arrays;

import static java.util.Comparator.comparing;

public class ArrangeWords {
    public static void arrange(String sentence) {
        sentence = sentence.substring(0,sentence.length()-1);
        String[] words = sentence.toLowerCase().split("\\s+");
        Arrays.sort(words, comparing(String::length));
        words[0] = words[0].substring(0,1).toUpperCase() + words[0].substring(1);
        System.out.println(String.join(" ",words));
    }
}
