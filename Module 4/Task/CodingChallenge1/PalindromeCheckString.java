package CodingChallenge1;

public class PalindromeCheckString {
        public static void main(String[] args) {
            String str1 = "racecar";
            String str2 = "10801";

            System.out.println(str1 + " is a palindrome: " + isPalindrome(str1));
            System.out.println(str2 + " is a palindrome: " + isPalindrome(str2));
        }

        public static boolean isPalindrome(String str) {
            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }


