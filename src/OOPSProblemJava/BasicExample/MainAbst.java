package OOPSProblemJava.BasicExample;

abstract class Shape1 {
    abstract void draw();
}

class Circle1 extends Shape1 {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square1 extends Shape1 {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}

public class MainAbst {
    public static void main(String[] args) {
        Shape1 circle = new Circle1();
        Shape1 square = new Square1();

        circle.draw(); // Output: Drawing a circle
        square.draw(); // Output: Drawing a square
    }
}
