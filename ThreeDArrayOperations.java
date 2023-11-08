import java.util.Random;
import java.util.Scanner;

public class ThreeDArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get dimensions from the user
        System.out.print("Enter the dimensions of the 3D array (x y z): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        // Step 2: Initialize the 3D array with random values
        int[][][] threeDArray = new int[x][y][z];
        Random random = new Random();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    threeDArray[i][j][k] = random.nextInt(100); // Initialize with random values between 0 and 99
                }
            }
        }

        // Step 3: Find the maximum value in the array
        int max = threeDArray[0][0][0];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    if (threeDArray[i][j][k] > max) {
                        max = threeDArray[i][j][k];
                    }
                }
            }
        }

        // Step 4: Calculate the average of all elements
        int sum = 0;
        int count = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    sum += threeDArray[i][j][k];
                    count++;
                }
            }
        }
        double average = (double) sum / count;

        // Step 5: Display the array
        System.out.println("\n3D Array:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println(); // Move to the next row
            }
            System.out.println(); // Add a separator between 2D slices
        }

        // Step 6: Display the maximum value and average
        System.out.println("\nMaximum Value in the Array: " + max);
        System.out.println("Average of All Elements: " + average);

        scanner.close();
    }
}
