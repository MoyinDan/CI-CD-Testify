package org.task;

public class Task3 {
    public static void main(String[] args) {

//                  Task 3
//        Create a variable and store your age in it.
//        concatenate your age with a string and
//        print it out on the console using the two methods of concatenation you were taught

        // Storing age in a variable
        int age = 25;

        // String to String concatenation
        String concatenatedString1 = "Mary Daniel is " + age + " years old.";
        System.out.println(concatenatedString1);

        // String to primitive concatenation
        String concatenatedString2 = "Mary Daniel is ".concat(String.valueOf(age)).concat(" years old.");
        System.out.println(concatenatedString2);





//        //String and String Concatenation
//        //String name = "Thompson ";
//        //String adjective = "is an handsome boy";
//        //System.out.println(name + adjective);
//
//        //String and Primitive concat
//        String movie = "Matrix ";
//        int part = 5;
//        //System.out.println(movie + part);
    }
}
