import java.util.concurrent.Semaphore;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Semaphore theOnlySemaphore = new Semaphore(0);
        for (int i = 0; i < 2; i++) {
            RunnableSemaphoreAcquire rsa1 = new RunnableSemaphoreAcquire(theOnlySemaphore);
            RunnableSemaphoreRelease rsr1 = new RunnableSemaphoreRelease(theOnlySemaphore);

            Thread thread1 = new Thread(rsa1);
            Thread thread2 = new Thread(rsr1);

            thread1.start();
            thread2.start();

            thread2.join();
            thread1.join();
        }
    }
}
