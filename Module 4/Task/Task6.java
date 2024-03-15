package org.task;

public class Task6 {
//         Task 6
//    Write a code to reverse the string DEMOCRACY and get the word COME out of it.
//         HOW TO SUBMIT:
//    Create a Module 4 directory on your Test Automation Repository on Github
//    Inside this folder, Create a Task and a 1 week challenge Folders
//    Push this task code inside your TASK Folder. Ensure you follow the naming convention
//
//    Test_Automation_School Repository >> Module 4 >> Task >> Task 6
            public static void main(String[] args) {
                // Original string
                String word = "DEMOCRACY";
                System.out.println(word. toUpperCase());

                // Reverse the original string
                String reversedWord = new StringBuilder(word).reverse().toString();
                System.out.println(new StringBuilder(word).reverse().toString());

                // Extract the word "COME" from the reversed string
                String extractedWord = reversedWord.substring(3, 7);
                System.out.println(reversedWord.substring(4,8));
            }
        }



