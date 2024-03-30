package CodingChallenge1;

public class PalindromeCheckNumber {
            public static void main(String[] args) {
                int num1 = 10801;
                int num2 = 12321;

                System.out.println(num1 + " is a palindrome: " + isPalindrome(num1));
                System.out.println(num2 + " is a palindrome: " + isPalindrome(num2));
            }

            public static boolean isPalindrome(int num) {
                int originalNum = num;
                int reversedNum = 0;

                while (num != 0) {
                    int digit = num % 10;
                    reversedNum = reversedNum * 10 + digit;
                    num /= 10;
                }

                return originalNum == reversedNum;
            }
        }


