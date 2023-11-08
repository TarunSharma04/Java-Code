import java.util.Arrays;


    public class VariableDeclaration {
    public static void main(String[] args) {
        // Primitive data types
        int age = 30;
        double salary = 50000.50;
        char gender = 'M';
        boolean isStudent = true;

        // Reference data types
        String name = "John Doe";
        int[] scores = {80, 90, 95};
        // You can also declare other reference types like classes, interfaces, etc.

        // Constant variable (use 'final' keyword)
        final int YEAR_OF_BIRTH = 1993;

        // Multiple variable declaration in one line
        int x = 10, y = 20, z = 30;

        // Variable declaration with explicit data type
        float pi = 3.14f;
        long population = 7896541230L;

        // Default initialization (Java assigns default values if not explicitly initialized)
        int defaultValueInt;
        double defaultValueDouble;
        char defaultValueChar;
        boolean defaultValueBoolean;
        // For reference types (like String), the default value is null.
        
        // Print variables to verify values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Gender: " + gender);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Scores: " + Arrays.toString(scores));
        System.out.println("Year of Birth: " + YEAR_OF_BIRTH);
        System.out.println("X: " + x + ", Y: " + y + ", Z: " + z);
        System.out.println("Pi: " + pi);
        System.out.println("Population: " + population);
    }
}