package CodingChallenge6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Using  Java  Code,  check  for  Anagrams  in  these  strings:
// "Despite commuting at the peek hour, she was able to keep to time"
public class AnagramChecker {
        public static void main(String[] args) {
            String input = "Despite commuting at the peek hour, she was able to keep to time";

            List<String> anagrams = findAnagrams(input);

            if (anagrams.isEmpty()) {
                System.out.println("No anagrams found in the given string.");
            } else {
                System.out.println("Anagrams found in the given string: " + anagrams);
            }
        }

        public static List<String> findAnagrams(String input) {
            // Remove non-alphabetic characters and convert to lowercase
            String cleanInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

            // Split the string into words
            String[] words = cleanInput.split("\\s+");

            List<String> anagrams = new ArrayList<>();

            // Compare sorted versions of all pairs of words
            for (int i = 0; i < words.length - 1; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    if (isAnagram(words[i], words[j])) {
                        anagrams.add(words[i] + " and " + words[j]);
                    }
                }
            }

            return anagrams;
        }

        public static boolean isAnagram(String word1, String word2) {
            char[] charArray1 = word1.toCharArray();
            char[] charArray2 = word2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            return Arrays.equals(charArray1, charArray2);
        }
    }


