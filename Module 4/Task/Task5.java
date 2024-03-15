package org.task;

public class Task5 {
    public static void main(String[] args) {
//        //Task 5
////        Write a code to: If the number is divisible by 3, print Fizz instead of the number.
////                If the number is divisible by 5, print Buzz instead of the number.
////                If the number is divisible by 3 and 5 both, print FizzBuzz instead of the number.
//        HOW TO SUBMIT:
//
//        Create a Module 4 directory on your Test Automation Repository on Github
//        Inside this folder, Create a Task and a 1 week challenge Folders
//        Push this task code inside your TASK Folder. Ensure you follow the naming convention
//
//        Test_Automation_School Repository >> Module 4 >> Task >> Task 5

        int number = 100;
        {
            // Check if the number is divisible by 3 first
            if (number % 3 == 0) {
                System.out.println("Fizz");
            }

            // Check if the number is divisible by 5
            else if (number % 5 == 0) {
                System.out.println("Buzz");
            }
            // Check if the number is divisible by both 3 and 5
            else if (number % 5 == 0 && number % 3 == 0) {
                System.out.println("FizzBuzz");
            }

            // If the number is not divisible by 3 or 5, print the number itself
            else {
                System.out.println(number);
            }
        }
    }
}




