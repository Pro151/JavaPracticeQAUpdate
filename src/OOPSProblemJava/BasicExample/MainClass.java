package OOPSProblemJava.BasicExample;

class Car {
    String brand;
    String model;

    void start() {
        System.out.println("Car is starting.");
    }
}

public class MainClass {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.model = "Camry";
        myCar.start();
    }
}
