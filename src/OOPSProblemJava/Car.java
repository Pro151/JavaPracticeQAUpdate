public class Car {
    // Instance variables (attributes)
    private String make;
    private String model;
    private int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Setter methods
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Other methods
    public void start() {
        System.out.println("The " + year + " " + make + " " + model + " is starting.");
    }

    public void stop() {
        System.out.println("The " + year + " " + make + " " + model + " has stopped.");
    }

    public static void main(String[] args) {
        // Creating a Car object using the constructor
        Car myCar = new Car("Toyota", "Camry", 2023);

        // Accessing and displaying object properties
        System.out.println("My car is a " + myCar.getYear() + " " + myCar.getMake() + " " + myCar.getModel());

        // Calling methods on the object
        myCar.start();
        myCar.stop();
    }
}
