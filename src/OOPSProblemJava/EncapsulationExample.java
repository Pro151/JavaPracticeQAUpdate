public class Student {
    // Private instance variables (attributes)
    private String name;
    private int age;
    private String studentID;

    // Constructor to initialize the object
    public Student(String name, int age, String studentID) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    // Getter methods to access private variables
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentID() {
        return studentID;
    }

    // Setter methods to modify private variables
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    // Display student information
    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentID);
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        // Creating a Student object
        Student student1 = new Student("John", 20, "123456");

        // Accessing and modifying the object's attributes through getters and setters
        student1.setAge(21);
        student1.setStudentID("789012");

        // Displaying student information
        student1.displayStudentInfo();
    }
}
