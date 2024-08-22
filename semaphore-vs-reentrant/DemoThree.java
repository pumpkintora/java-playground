import java.util.concurrent.Semaphore;

public class DemoThree {
    private static final Semaphore semaphore = new Semaphore(1);

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread trying to acquire semaphore for the first time.");
                semaphore.acquire();
                System.out.println("Semaphore acquired for the first time.");

                System.out.println("Thread trying to acquire semaphore for the second time.");
                semaphore.acquire();  // This will cause the thread to block indefinitely
                System.out.println("Semaphore acquired for the second time.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
                semaphore.release();
            }
        });

        thread.start();
    }
}
