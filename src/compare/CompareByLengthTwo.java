package compare;

import java.util.Arrays;
import java.util.Comparator;

public class CompareByLengthTwo {
    public static void main(String[] args) {
        String[] str = {"hello", "world", "i", "love", "apple", "foreign"};

        Comparator<String> c = (first, second) -> {
            return first.length() - second.length();
        };

        Arrays.sort(str, c);
        System.out.println(Arrays.toString(str));
    }
}
