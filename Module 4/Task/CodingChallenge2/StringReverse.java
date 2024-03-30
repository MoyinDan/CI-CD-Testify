package CodingChallenge2;

//Reverse the position of words in "I am the best AutomationTester" using recursion:
public class StringReverse {
        public static void main(String[] args) {
            String input = "I am the best AutomationTester";
            String reversed = reverseWords(input);
            System.out.println("Reversed String: " + reversed);
        }

        public static String reverseWords(String input) {
            // Base case: if the input is empty or has only one word
            if (input == null || input.isEmpty() || !input.contains(" ")) {
                return input;
            }

            // Find the index of the first space
            int index = input.indexOf(" ");

            // Extract the first word and recursively reverse the remaining substring
            String reversed = reverseWords(input.substring(index + 1)) + " " + input.substring(0, index);

            return reversed.trim(); // Trim to remove any leading/trailing spaces
        }
    }


