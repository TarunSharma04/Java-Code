import java.util.Scanner;

class EvenNumberPrinter extends Thread {
    private int limit;

    public EvenNumberPrinter(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        for (int i = 2; i <= limit; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddNumberPrinter extends Thread {
    private int limit;

    public OddNumberPrinter(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        for (int i = 1; i <= limit; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class EvenOddThread {
    public static void main(String[] args) {
        // Create a scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for the range
        System.out.print("Enter the upper limit for even and odd numbers: ");
        int limit = scanner.nextInt();

        // Create and start the threads
        EvenNumberPrinter evenThread = new EvenNumberPrinter(limit);
        OddNumberPrinter oddThread = new OddNumberPrinter(limit);

        evenThread.start();
        oddThread.start();

        // Close the scanner
        scanner.close();
    }
}
