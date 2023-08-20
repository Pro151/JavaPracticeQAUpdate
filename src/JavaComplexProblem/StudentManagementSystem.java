package JavaComplexProblem;

import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private double[] marks;

    public Student(String name, int age, double[] marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + java.util.Arrays.toString(marks));
        System.out.println("Average: " + calculateAverage());
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Number of subjects: ");
            int numSubjects = scanner.nextInt();
            double[] marks = new double[numSubjects];
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter mark for Subject " + (j + 1) + ": ");
                marks[j] = scanner.nextDouble();
            }
            students[i] = new Student(name, age, marks);
        }

        System.out.println("\nStudent Information:");
        for (Student student : students) {
            student.displayInfo();
            System.out.println("--------------------");
        }
    }
}
