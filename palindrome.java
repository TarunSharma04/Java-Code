import java.util.Scanner;

public class palindrome {

    // Function to check if a given string is a palindrome
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase(); // Convert the string to lowercase
        int left = 0; // Initialize a pointer at the beginning of the string
        int right = str.length() - 1; // Initialize a pointer at the end of the string

        // Compare characters from both ends until the pointers meet
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters don't match, not a palindrome
            }
            left++; // Move the left pointer to the right
            right--; // Move the right pointer to the left
        }
        return true; // All characters matched, it's a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); // Read the input string

        if (isPalindrome(input)) {
            System.out.println("The string "+input+ " is a palindrome.");
        } else {
            System.out.println("The string "+input+ " is not a palindrome.");
        }
    }
}
