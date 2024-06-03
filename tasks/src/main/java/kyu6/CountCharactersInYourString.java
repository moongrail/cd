package kyu6;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersInYourString {
    public static Map<Character, Integer> count(String str) {
        // Happy coding!
        Map<Character, Integer> result = new HashMap<>();
        if (str == null || str.isEmpty()) return result;
        char[] charArray = str.toCharArray();
        for (Character c : charArray) {
            result.put(c, result.getOrDefault(c, 0) + 1);
        }
        return result;
    }
}
