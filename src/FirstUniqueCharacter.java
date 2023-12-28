import java.util.*;
public class FirstUniqueCharacter {

    public static char firstUniqueChar(String s) {
        if (s == null || s.isEmpty()) {
            return ' ';
        }
        Map<Character, Integer> charFrequency = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }
        for (char c : s.toCharArray()) {
            if (charFrequency.get(c) == 1) {
                return c;
            }
        }
        return ' ';
    }
    public static void main(String[] args) {
        String input = "leetcode";
        char result = firstUniqueChar(input);
        System.out.println("First unique character: " + result);
    }
}
