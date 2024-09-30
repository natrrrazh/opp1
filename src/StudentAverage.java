import java.util.Scanner;

class Student {
    private String name;
    private String studentId;
    private double[] marks;

    // Constructor
    public Student(String name, String studentId, double[] marks) {
        this.name = name;
        this.studentId = studentId;
        this.marks = marks;
    }

    // Method to calculate average mark
    public double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Average Mark: " + calculateAverage());
    }
}

public class StudentAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student information
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
        double[] marks = new double[numSubjects];

        // Input marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter mark for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }

        // Create a Student object
        Student student = new Student(name, studentId, marks);

        // Display student information
        student.displayInfo();

        scanner.close();
    }
}