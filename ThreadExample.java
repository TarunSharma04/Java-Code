import java.util.Scanner;

class MyThread extends Thread {
    private String message;

    public MyThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.print(message); // Print the message
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for message A
        System.out.print("Enter message for Thread A: ");
        String messageA = scanner.nextLine();

        // Take user input for message B
        System.out.print("Enter message for Thread B: ");
        String messageB = scanner.nextLine();

        // Create Thread A with user-specified message
        MyThread threadA = new MyThread(messageA);

        // Create Thread B with user-specified message
        MyThread threadB = new MyThread(messageB);

        // Start Thread A
        threadA.start();

        // Start Thread B
        threadB.start();

        try {
            // Wait for Thread A to finish
            threadA.join();

            // Wait for Thread B to finish
            threadB.join();

            // Create and start Thread C to print "Done"
            Thread threadC = new Thread(() -> {
                System.out.println("\nDone");
            });
            threadC.start();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        scanner.close();
    }
}
