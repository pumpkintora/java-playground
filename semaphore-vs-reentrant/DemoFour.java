import java.util.concurrent.locks.ReentrantLock;

public class DemoFour {
    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread trying to acquire lock for the first time.");
                lock.lock();
                System.out.println("Lock acquired for the first time.");

                System.out.println("Thread trying to acquire lock for the second time.");
                lock.lock();  // The thread can acquire the lock again
                System.out.println("Lock acquired for the second time.");
            } finally {
                lock.unlock();
                lock.unlock();
            }
        });

        thread.start();
    }
}
