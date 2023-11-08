import java.util.Scanner;
import java.util.TreeSet;

public class StateNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> stateSet = new TreeSet<>(); // Create a TreeSet to store state names

        System.out.print("Enter the number of states: ");
        int n = scanner.nextInt(); // Get the number of states from the user

        // Input state names
        System.out.println("Enter the state names:");
        scanner.nextLine(); // Consume newline
        for (int i = 0; i < n; i++) {
            String stateName = scanner.nextLine();
            stateSet.add(stateName); // Add state name to TreeSet
        }

        // Print the sorted state names
        System.out.println("\nSorted State Names:");
        for (String state : stateSet) {
            System.out.println(state);
        }

        scanner.close();
    }
}
