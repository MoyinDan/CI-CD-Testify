package org.task;

import java.util.Scanner;

public class Task10 {

//          Task 10
//        Create a method that verify that visitors on the slack channel are coming fot testify Trainings.
//        If they write" Testify" then print out a  welcome messsage if not , theuser should be shown rejection message.
//        after creating this method,then invoke the created method in your main method
//
//        HOW TO SUBMIT:
//        Create a Module 4 directory on your Test Automation Repository on Github
//        Inside this folder, Create a Task and a 1 week challenge Folders
//        Push this task code inside your TASK Folder. Ensure you follow the naming convention
//
//        Test_Automation_School Repository >> Module 4 >> Task >> Task 10


            public static void verifyVisitor(String userInput) {
                // Check if the user input contains "Testify"
                if (userInput.toLowerCase().contains("testify")) {
                    System.out.println("Welcome to the Testify Trainings Slack channel!");
                } else {
                    System.out.println("Sorry, you are not authorized to access this channel.");
                }
            }
            public static void main(String[] args) {
                // Create a Scanner object to read user input
                Scanner scanner = new Scanner(System.in);

                // Prompt the user to enter their message
                System.out.print("Enter your message: ");
                String userInput = scanner.nextLine();

                // Verify the visitor based on their message
                verifyVisitor(userInput);

            }
        }



