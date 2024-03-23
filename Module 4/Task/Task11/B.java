package Task11;

public class B {
                  //Task 11
    //Create a class A, create a method that accepts a String parameter "name" and returns the "name" value.
    // Create an object of that class in another class  "B" and SOUT the contents from the methods in class A
    //
    //HOW TO SUBMIT:
    //
    //Create a Module 4 directory on your Test Automation Repository on Github
    //Inside this folder, Create a Task and a 1 week challenge Folders
    //Push this task code inside your TASK Folder. Ensure you follow the naming convention
    //
    //Test_Automation_School Repository >> Module 4 >> Task >> Task 11

    public static void main(String[] args) {
        // Create an object of class A
        A objectA = new A();

        // Call the method getName() from class A and print its contents
        String name = objectA.getName("Mary");
        System.out.println("Name from method in classA: " + name);
    }
}





