// Shape class representing a basic shape
class Shape {
    // Default implementation for getting perimeter
    public double getPerimeter() {
        return 0.0;
    }

    // Default implementation for getting area
    public double getArea() {
        return 0.0;
    }
}

// Circle subclass extending the Shape class
class Circle extends Shape {
    private double radius;

    // Constructor to initialize the circle with a given radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override to calculate the perimeter of the circle
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override to calculate the area of the circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// que1 class to demonstrate the program
public class que1 {
    public static void main(String[] args) {
        // Creating a Circle object with radius 5.0
        Circle circle = new Circle(5.0);
        
        // Displaying the calculated perimeter and area of the circle
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Circle Area: " + circle.getArea());
    }
}
