import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Calculate the length of the string
        int length = calculateStringLength(inputString);

        // Display the length of the string
        System.out.println("Length of the string: " + length);

        // Close the scanner
        scanner.close();
    }

    // Function to calculate the length of a string
    public static int calculateStringLength(String str) {
        int count = 0;

        // Loop through each character in the string
        for (char c : str.toCharArray()) {
            count++;
        }

        return count;
    }
}
