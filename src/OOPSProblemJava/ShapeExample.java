package OOPSProblemJava;

// Abstract class Shape
abstract class Shape {
    abstract double area(); // Abstract method to calculate area
}

// Circle class extending Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

public class ShapeExample {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.area());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}

/* Problem: Creating Shapes with Abstract Methods

You are tasked with creating a program to model different shapes. Implement an
abstract class Shape with an abstract method area().
Create subclasses Circle and Rectangle that extend the Shape class and provide
implementations for the area() method.

In this example:

The Shape class is an abstract class with an abstract method area() that is meant to
be implemented by its subclasses.
The Circle class extends Shape and provides an implementation of the area() method to
 calculate the area of a circle.
The Rectangle class also extends Shape and provides an implementation of the area()
 method to calculate the area of a rectangle.
In the main method, we create instances of Circle and Rectangle and demonstrate the use
of abstract methods and inheritance.
This example showcases the concept of abstract classes and abstract methods,
where the abstract class defines a contract for its subclasses to implement a specific method.


*/