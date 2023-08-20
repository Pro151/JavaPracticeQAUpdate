package JavaComplexProblem.Problem1;

import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }
}

public class StudentManagementSystem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3]; // Array to hold student records

        // Input student records
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("GPA: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            students[i] = new Student(name, age, gpa);
        }

        // Display student records
        System.out.println("\nStudent Records:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Name: " + students[i].getName());
            System.out.println("Age: " + students[i].getAge());
            System.out.println("GPA: " + students[i].getGpa());
            System.out.println();
        }
    }
}
