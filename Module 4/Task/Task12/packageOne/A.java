package Task12.packageOne;

public class A {

    //Create two packages. in each of the packages create one class each Class A and Class B.
    // create a method in class A that can be accessed anywhere in that project and
    // create a method in Class B that can only be accessed within a class.
    //

    public static void main(String[] args) {
        A a = new A();
         a.publiclyAccessibleMethod();

    }
    // Method that can be accessed anywhere in the project
    public void publiclyAccessibleMethod() {
        System.out.println("Method in Task11.ClassA: Accessible anywhere in the project");
    }
}


