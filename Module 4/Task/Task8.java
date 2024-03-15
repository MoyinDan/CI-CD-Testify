package org.task;

import java.util.Scanner;

public class Task8 {
        public static void main(String[] args) {
                               //Task 8
//            Build a Simple interest calculator. Write a program to ask the user for the necessary field you need in calculating the simple interest and then communicate the simple interest back to the user is a good sentence
//
//            HOW TO SUBMIT:
//
//            Create a Module 4 directory on your Test Automation Repository on Github
//            Inside this folder, Create a Task and a 1 week challenge Folders
//            Push this task code inside your TASK Folder. Ensure you follow the naming convention
//
//            Test_Automation_School Repository >> Module 4 >> Task >> Task 8

            // Create a Scanner object to read user input
            Scanner scanner = new Scanner(System.in);

            // Ask the user for necessary inputs
            System.out.print("Enter principal amount: ");
            double principal = scanner.nextDouble();

            System.out.print("Enter rate of interest (in percentage): ");
            double rate = scanner.nextDouble();

            System.out.print("Enter time period (in years): ");
            double time = scanner.nextDouble();

            // Calculate simple interest
            double simpleInterest = (principal * rate * time) / 100;

            // Communicate the simple interest back to the user
            System.out.println("The simple interest calculated is: $" + simpleInterest);

            // Close the scanner to prevent resource leak
            scanner.close();
        }
    }


