class ApplicationThread extends Thread {
    private String applicationName;

    public ApplicationThread(String applicationName) {
        this.applicationName = applicationName;
    }

    @Override
    public void run() {
        // Synchronize the threads using a class-level lock
        synchronized (ApplicationThread.class) {
            try {
                // Sleep for a moment to ensure the correct execution order
                Thread.sleep(100);
                System.out.println("Running " + applicationName);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SequentialApp {
    public static void main(String[] args) {
        // Take user input for the order of execution
        System.out.println("Enter the order of execution (e.g., GFB for Gmail, Facebook, Instagram): ");
        String executionOrder = System.console().readLine().toUpperCase();

        for (char app : executionOrder.toCharArray()) {
            switch (app) {
                case 'G':
                    new ApplicationThread("Gmail").start();
                    break;
                case 'F':
                    new ApplicationThread("Facebook").start();
                    break;
                case 'I':
                    new ApplicationThread("Instagram").start();
                    break;
                default:
                    System.out.println("Invalid input. Use G, F, and I for Gmail, Facebook, and Instagram.");
                    break;
            }
        }
    }
}
