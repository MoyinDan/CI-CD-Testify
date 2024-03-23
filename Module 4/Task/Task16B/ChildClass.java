package Task16B;

import Task15.ChildClassB;

public class ChildClass extends ParentClass {

    //OVERRIDING: Create two methods in a parent class with arguements.
    // write a print statement in the method body,
    // Overide the 2 methods in the child class and write a diffreent print statement in the body of the overriding method


    // Overriding method 1
    @Override
    public void method1(int number) {
        System.out.println("Child class - Overridden Method 1: " + number);
    }

    // Overriding method 2
    @Override
    public void method2(String message) {
        System.out.println("Child class - Overridden Method 2: " + message);
    }


    public static void main(String[] args) {
        // Create an object of child class
        ChildClass child = new ChildClass();

        // Call the overridden methods
        child.method1(10);
        child.method2("Hello");
    }
}


