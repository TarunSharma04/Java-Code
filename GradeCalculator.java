import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the percentage of marks
        System.out.print("Enter the percentage of marks: ");

        // Read the percentage of marks entered by the user
        double percentage = input.nextDouble();

        // Calculate the grade based on the percentage of marks
        String grade = calculateGrade(percentage);

        // Display the calculated grade
        System.out.println("Grade: " + grade);

        // Close the Scanner object to free resources
        input.close();
    }

    // Method to calculate the grade based on the percentage of marks
    public static String calculateGrade(double percentage) {
        if (percentage >= 90 && percentage <= 100) {
            return "A+";
        } else if (percentage >= 75 && percentage < 90) {
            return "A";
        } else if (percentage >= 60 && percentage < 75) {
            return "B";
        } else if (percentage >= 40 && percentage < 60) {
            return "C";
        } else {
            return "Fail";
        }
    }
}
