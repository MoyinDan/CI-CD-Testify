package Task13;

public class A {
    //Create 3 different constructors of a class A.
    // Create 3 objects of Class A in class B and
    // use the 3 different constructors when creating each of the objects of class A in class B

    public static void main(String[] args) {

    }
        private int value;


        // Constructor 1: Default constructor
        public A() {
            this.value = 0;
        }

        // Constructor 2: Constructor with one parameter
        public A(int value) {
            this.value = value;
        }

        // Constructor 3: Constructor with two parameters
        public A(int value1, int value2) {
            this.value = value1 + value2;
        }

        // Getter method for value
        public int getValue() {
            return value;
        }
    }





