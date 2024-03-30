package CodingChallenge7;

//Reverse "TestifyAutomation" using recursion in Java
public class StringReverseRecursion {
        public static void main(String[] args) {
            String input = "Testify Automation";
            String reversed = reverseString(input);
            System.out.println("Reversed String: " + reversed);
        }

        public static String reverseString(String str) {
            if (str == null || str.length() <= 1) {
                return str;
            }
            // Swap the first and last characters and recursively reverse the substring between them
            return str.charAt(str.length() - 1) + reverseString(str.substring(1, str.length() - 1)) + str.charAt(0);
        }
    }



