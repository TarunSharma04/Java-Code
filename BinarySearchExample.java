import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchExample {

    // Binary search method
    static int binarySearch(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate the middle index of the interval

            if (arr[mid] == target)
                return mid; // Element found at mid index

            if (arr[mid] < target)
                left = mid + 1; // Ignore left half and adjust the left pointer
            else
                right = mid - 1; // Ignore right half and adjust the right pointer
        }

        return -1; // Element not found
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array--> ");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements-->");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        Arrays.sort(arr);  // Sort the array
        System.out.println("Sorted Array--> " + Arrays.toString(arr));  // Display the sorted array
        
        System.out.print("Enter the Element to search--> ");
        int target = scanner.nextInt();

        int result = binarySearch(arr, target);

        if (result == -1)
            System.out.println("Element not present in the array");
        else
            System.out.println("Element found at index -->" + result);

        scanner.close();
    }
}
