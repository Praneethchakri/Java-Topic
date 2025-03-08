package algorithms;

import java.util.HashMap;
import java.util.Map;

public class LongestString {
    public static void main(String[] args) {
        subString("Praneeth");
    }

    public static void subString(String inputString) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0; // To store the length of the longest substring
        int start = 0; // Starting index of the current substring
        int startIndex = 0; // Starting index of the longest substring

        for (int end = 0; end < inputString.length(); end++) {
            char currentChar = inputString.charAt(end);

            // If the character is already in the map and its index is >= start,
            // move the start pointer to the right of the previous occurrence
            if (map.containsKey(currentChar) && map.get(currentChar) >= start) {
                start = map.get(currentChar) + 1;
            }

            // Update the map with the current character's index
            map.put(currentChar, end);

            // Update the maximum length and starting index if a longer substring is found
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                startIndex = start;
            }
        }

        // Extract and print the longest substring
        String longestSubstring = inputString.substring(startIndex, startIndex + maxLength);
        System.out.println("Longest substring without repeating characters: " + longestSubstring);
        System.out.println("Length: " + maxLength);
    }
}