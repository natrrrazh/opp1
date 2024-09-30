// Base class
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class
class Teacher extends Person {
    private String subject;
    private String employeeId;

    // Constructor
    public Teacher(String name, int age, String subject, String employeeId) {
        super(name, age); // Call the constructor of Person
        this.subject = subject;
        this.employeeId = employeeId;
    }

    // Method to display teacher information
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo method of Person
        System.out.println("Subject: " + subject);
        System.out.println("Employee ID: " + employeeId);
    }
}

// Main class
public class School {
    public static void main(String[] args) {
        // Create a Teacher object
        Teacher teacher = new Teacher("Alice Smith", 30, "Mathematics", "T12345");

        // Display teacher information
        teacher.displayInfo();
    }
}
