package Task19C;

public class B extends A {
    String name = "Anderson"; // Attribute in class B

    // Method to access the name variable from class A
    String getNameFromClassA() {
        return super.name;
    }

    public static void main(String[] args) {
        B objB = new B();

        // Accessing the value of the variable from class A using a method in class B
        System.out.println("Value of name from Class A: " + objB.getNameFromClassA());

        // Accessing the value of the variable from class B directly
        System.out.println("Value of name from Class B: " + objB.name);
    }

}
