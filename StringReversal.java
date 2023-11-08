import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        // Call the reverseString method to reverse the input string
        String reversed = reverseString(input);
        
        // Display the reversed string
        System.out.println("Reversed string: " + reversed);
    }

    // Method to reverse a given string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        
        // Iterate through the characters of the input string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            // Append each character to the StringBuilder in reverse order
            reversed.append(str.charAt(i));
        }
        
        // Convert the StringBuilder to a String and return the reversed string
        return reversed.toString();
    }
}
