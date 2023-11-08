import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first character of your name
        System.out.print("Enter the first character of your name: ");
        char character = scanner.nextLine().charAt(0);

        // Define the character patterns for each letter
        charPattern(character);

        // Close the scanner
        scanner.close();
    }

    // Function to print character pattern based on the input character
    public static void charPattern(char ch) {
        switch (ch) {
            case 'A':
                System.out.println("  A");
                System.out.println(" A A");
                System.out.println("AAAAA");
                System.out.println("A   A");
                System.out.println("A   A");
                break;
            case 'B':
                System.out.println("BBBB");
                System.out.println("B   B");
                System.out.println("BBBB");
                System.out.println("B   B");
                System.out.println("BBBB");
                break;
            case 'C':
                System.out.println(" CCC");
                System.out.println("C");
                System.out.println("C");
                System.out.println("C");
                System.out.println(" CCC");
                break;
            // Add more cases for other characters if needed

            default:
                System.out.println("Pattern not available for this character.");
        }
    }
}
