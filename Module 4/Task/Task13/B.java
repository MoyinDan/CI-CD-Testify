package Task13;

public class B {

    // Class B
        public static void main(String[] args) {
            // Creating objects of class A using different constructors
            A obj1 = new A(); // Constructor 1: Default constructor
            A obj2 = new A(10); // Constructor 2: Constructor with one parameter
            A obj3 = new A(20, 30); // Constructor 3: Constructor with two parameters

            // Printing values of objects
            System.out.println("Value of obj1: " + obj1.getValue());
            System.out.println("Value of obj2: " + obj2.getValue());
            System.out.println("Value of obj3: " + obj3.getValue());
        }
    }

