package Task18;

import java.util.InputMismatchException;
import java.util.Scanner;

//Write a code that asks the user for age and that accepts the Integer value.
// Handle the error that is encountered when the users tries to enter a name instead of age


public class ErrorHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask the user for age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Print the age entered by the user
            System.out.println("Your age is: " + age);
        } catch (InputMismatchException e) {
            // Handle the error if the user enters a name instead of an age
            System.out.println("Error: Please enter a valid age as an integer.");
        }

    }
}






