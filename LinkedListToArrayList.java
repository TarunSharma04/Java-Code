import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Scanner;

public class LinkedListToArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a LinkedList to store user input
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        System.out.print("Enter the number of elements in the linked list: ");
        int n = scanner.nextInt(); // Get the number of elements from the user
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            linkedList.add(scanner.nextInt()); // Add user input elements to the LinkedList
        }

        // Convert LinkedList to ArrayList using constructor
        ArrayList<Integer> arrayList = new ArrayList<>(linkedList);

        // Print the ArrayList
        System.out.println("ArrayList: " + arrayList);

        scanner.close();
    }
}
