package Task16A;

public class A {

    //OVERLOADING: Create a method in a class and Overload in
    // using the 3 different ways of overloading that you know.
    //


    // Method 1: Overloading by changing the number of parameters
    public void printMessage() {
        System.out.println("No parameter method");

    }

    public void printMessage(String message) {
        System.out.println("Message: " + message);

    }

    // Method 2: Overloading by changing the data type of parameters
    public void printNumber(int number) {
        System.out.println("Integer number: " + number);

    }

    public void printNumber(double number) {
        System.out.println("Double number: " + number);
    }

    // Method 3: Overloading by changing the sequence of parameters
    public void printValues(int value1, double value2) {
        System.out.println("Integer value: " + value1 + ", Double value: " + value2);
    }

    public void printValues(double value2, int value1) {
        System.out.println("Double value: " + value2 + ", Integer value: " + value1);

    }

    public static void main(String[] args) {
        A obj = new A();

        // Method 1: Overloading by changing the number of parameters
        obj.printMessage(); // No parameter method
        obj.printMessage("Hello, World!"); // Message: Hello, World!

        // Method 2: Overloading by changing the data type of parameters
        obj.printNumber(10); // Integer number: 10
        obj.printNumber(3.14); // Double number: 3.14

        // Method 3: Overloading by changing the Sequence of parameters
        obj.printValues(5, 7.5); // Integer value: 5, Double value: 7.5
        obj.printValues(7.5, 5); // Double value: 3.5, Integer value: 2

    }
}



