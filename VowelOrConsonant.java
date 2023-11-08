import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        // Check if the character is a vowel or a consonant
        if (isVowel(ch)) {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }

        // Close the Scanner object to free resources
        input.close();
    }

    // Method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        // Convert the character to lowercase to handle both uppercase and lowercase vowels
        char lowercaseCh = Character.toLowerCase(ch);

        // Check if the character is one of the vowels
        return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o' || lowercaseCh == 'u';
    }
}
