import java.util.concurrent.Semaphore;

public class RunnableSemaphoreAcquire implements Runnable {

    Semaphore semaphore;
    RunnableSemaphoreAcquire(Semaphore semaphore) {
        this.semaphore = semaphore;
    }
    @Override
    public void run() {
        try {
            System.out.println("Waiting for permit to acquire");
            semaphore.acquire();
            System.out.println("Semaphore acquired");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
