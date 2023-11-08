import java.util.Scanner;

public class StringReplacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the original string
        System.out.print("Enter the original string: ");
        String inputString = scanner.nextLine();

        // Take input for the replacement string
        System.out.print("Enter the replacement string: ");
        String replacement = scanner.nextLine();

        // Replace occurrences of the original string with the replacement
        String newString = replaceSubstring(inputString, replacement);

        // Display the new string with replacements
        System.out.println("New String: " + newString);

        scanner.close();
    }

    // Function to replace a string in another string
    public static String replaceSubstring(String str, String replacement) {
        // Use the replaceAll method to perform the replacement
        String newString = str.replace(str, replacement);
        return newString;
    }
}
