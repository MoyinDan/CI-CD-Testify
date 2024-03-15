package org.task;

import java.util.Scanner;

public class Task9B {
    public static void main(String[] args) {


//         Task 9B
//    Write a logic that takes in input from the user. It keeps printing "try again "until the user enters "testify"
//
//    HOW TO SUBMIT:
//
//    Create a Module 4 directory on your Test Automation Repository on Github
//    Inside this folder, Create a Task and a 1 week challenge Folders
//    Push this task code inside your TASK Folder. Ensure you follow the naming convention
//
//    Test_Automation_School Repository >> Module 4 >> Task >> Task 9B

            // Create a Scanner object to read user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter input
            System.out.print("Enter input: ");
            String userInput = scanner.nextLine();

            // Keep asking the user to try again until they enter "testify"
            while (!userInput.equals("testify")) {
                System.out.println("Try again");
                System.out.print("Enter input: ");
                userInput = scanner.nextLine();
            }

            // Close the scanner to prevent resource leak
            //scanner.close();

            System.out.println("You entered \"testify\". Exiting the loop.");
        }

       }


