package Task19B;

public class AnotherClass {
    // Another class where the static variable is accessed
        public static void main(String[] args) {
            // Accessing the static variable from MyClass
            int value = MyClass.myVariable;
            System.out.println("Value of myVariable from MyClass: " + value);
        }
    }

