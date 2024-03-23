package Task12.packageTwo;

public class B {
    public static void main(String[] args) {
        B b = new B();
        b.privatelyAccessibleMethod();

    }

    // Method that can be accessed anywhere in the project
    private void privatelyAccessibleMethod() {
        System.out.println("Method in Task11.ClassB: Accessible only within Task11.ClassB");
    }
}