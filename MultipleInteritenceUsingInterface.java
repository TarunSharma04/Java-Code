// Define the first interface
interface Parent1 {
    void method1(); // Method declaration
}
// Define the second interface
interface Parent2 {
    void method2(); // Method declaration
}
// Create a class that implements both interfaces
class Child implements Parent1, Parent2 {
    @Override
    public void method1() {
        System.out.println("Method 1 from Parent1");
    }

    @Override
    public void method2() {
        System.out.println("Method 2 from Parent2");
    }
}

public class MultipleInteritenceUsingInterface {
    public static void main(String[] args) {
        // Create an instance of the Child class
        Child child = new Child();

        // Call method1 from Parent1 interface
        child.method1();

        // Call method2 from Parent2 interface
        child.method2();
    }
}
