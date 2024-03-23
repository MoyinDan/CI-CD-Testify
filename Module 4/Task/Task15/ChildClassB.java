package Task15;

public class ChildClassB extends ParentClassA {
    // Method 4
    public void playFootBall() {
        System.out.println("Inside playFootBall of class B");
    }

    // Method 5
    public void playSoccer() {
        System.out.println("Inside playSoccer of class B");
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of class B
        ChildClassB objB = new ChildClassB();


        // Invoke all 5 methods
        objB.playGuitar(); // Invoking method1 of class A
        objB.playTennis(); // Invoking method2 of class A
        objB.playKeyboard(); // Invoking method3 of class A
        objB.playFootBall(); // Invoking method4 of class B
        objB.playSoccer(); // Invoking method5 of class B


    }
}
