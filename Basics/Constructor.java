class Student {
    // Fields (or member variables)
    String name;
    int age;

    // Constructor with parameters
    public Student(String studentName, int studentAge) {
        name = studentName; // Assigning the parameters to class variables
        age = studentAge;
    }

    // Default Constructor (no parameters)
    public Student() {
        name = "Unknown"; // Default value
        age = 0; // Default value
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        // Using parameterized constructor
        Student student1 = new Student("John", 20);
        student1.displayInfo();

        System.out.println(); // Just for spacing

        // Using default constructor
        Student student2 = new Student();
        student2.displayInfo();
    }
}
