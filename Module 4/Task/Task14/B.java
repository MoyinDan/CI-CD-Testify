package Task14;

public class B {
    // Class B
        public static void main(String[] args) {
            // Create an object of class A
            A square = new A();


            // Set the values of length and breadth
            square.setShapeLength(5.0);
            square.setShapeBreadth(5.0);

            // Calculate the area
            double area = square.getShapeLength() * square.getShapeBreadth();

            // Print the final calculation
            System.out.println("The area of a square of length: " + square.getShapeLength() +
                    " and breadth " + square.getShapeBreadth() + " is " + area);
        }
    }