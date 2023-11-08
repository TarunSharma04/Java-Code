import java.util.Scanner;

public class InputPrimitiveDataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for int
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("You entered an integer: " + intValue);

        // Input for double
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        System.out.println("You entered a double: " + doubleValue);

        // Input for char
        System.out.print("Enter a character: ");
        char charValue = scanner.nextLine().charAt(0);
        System.out.println("You entered a character: " + charValue);

        // Input for boolean
        System.out.print("Enter a boolean (true or false): ");
        boolean boolValue = scanner.nextBoolean();
        scanner.nextLine(); // Consume the newline character
        System.out.println("You entered a boolean: " + boolValue);

        // Input for String
        System.out.print("Enter a string: ");
        String stringValue = scanner.nextLine();
        System.out.println("You entered a string: " + stringValue);

        scanner.close();
    }
}
