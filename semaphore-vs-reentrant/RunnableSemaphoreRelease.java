import java.util.concurrent.Semaphore;

public class RunnableSemaphoreRelease implements Runnable {
    Semaphore semaphore;
    RunnableSemaphoreRelease(Semaphore semaphore) {
        this.semaphore = semaphore;
    }
    @Override
    public void run() {
        semaphore.release();
        System.out.println("Semaphore released");
    }
}
