import java.util.Scanner;
import java.util.Vector;

class Student {
    int id;
    String name;
    String qualification;

    // Constructor to initialize student information
    public Student(int id, String name, String qualification) {
        this.id = id;
        this.name = name;
        this.qualification = qualification;
    }
}

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Student> students = new Vector<>();

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt(); // Get the number of students from the user

        // Input student information
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Student Qualification: ");
            String qualification = scanner.nextLine();

            // Create a Student object and add to the Vector
            students.add(new Student(id, name, qualification));
        }

        // Print the student information
        System.out.println("\nStudent Information:");
        for (Student student : students) {
            System.out.println("ID: " + student.id);
            System.out.println("Name: " + student.name);
            System.out.println("Qualification: " + student.qualification);
            System.out.println();
        }

        scanner.close();
    }
}
