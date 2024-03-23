package Task14;

public class A {

    //You are to create 3 variables for a "square shape" class which will be "class A",
    // shapeSides (number of sides of the shape), shape length and shape breadth.
    // From your knowledge of encapsulation, create getters and setters for lenght and breadth variables and
    // create only a getter for shape side(this is becasue we dont want anyone setting the sides of a square.
    // the sides of the sqaure must and always will be 4). Create another class "B", set the values of length and breadth.
    // Get the value of the length and breadth and calculate the area. print out your final calculati0n like this.
    // "The area of a sqaure of length: {put the value of the length} and breadth {put the value of the breadth} is {put the value of the area u calculated}"
    //

    // Class A (SquareShape)
    // Private variables
    private int shapeSides;
    private double shapeLength;
    private double shapeBreadth;

    // Constructor
    public A() {
        this.shapeSides = 4; // Square always has 4 sides
    }

    // Getter for shapeSides (read-only)
    public int getShapeSides() {
        return shapeSides;
    }

    // Getter and setter for shapeLength
    public double getShapeLength() {
        return shapeLength;
    }

    public void setShapeLength(double length) {
        this.shapeLength = length;
    }

    // Getter and setter for shapeBreadth
    public double getShapeBreadth() {
        return shapeBreadth;
    }

    public void setShapeBreadth(double breadth) {
        this.shapeBreadth = breadth;
    }

    public static void main(String[] args) {

    }
}


