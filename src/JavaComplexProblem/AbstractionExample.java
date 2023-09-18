// Abstract class
abstract class Shape {
    // Abstract method (no implementation)
    public abstract double calculateArea();

    // Concrete method
    public void displayArea() {
        System.out.println("Area: " + calculateArea());
    }
}

// Concrete subclass
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // Creating objects of concrete classes
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Using the abstract class reference to call methods
        Shape shape1 = circle;
        Shape shape2 = rectangle;

        shape1.displayArea(); // Calls the Circle's calculateArea method
        shape2.displayArea(); // Calls the Rectangle's calculateArea method
    }
}
