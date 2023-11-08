import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int wordCount = countWords(inputString);
        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }

    // Function to count the number of words in a string
    public static int countWords(String str) {
        int count = 0;
        boolean isWord = false;

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Check if the character is a letter (a-z or A-Z)
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                isWord = true;
            } else {
                // If a non-letter character is encountered and we were in a word, increment count
                if (isWord) {
                    count++;
                    isWord = false; // Reset flag
                }
            }
        }

        // Handle the case where the string ends with a word
        if (isWord) {
            count++;
        }

        return count;
    }
}
