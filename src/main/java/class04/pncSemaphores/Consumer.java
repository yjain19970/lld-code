package class04.pncSemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    private Queue<Object> q;
    private int maxSize;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;
    private String name;

    public Consumer(Queue<Object> q, int maxSize, Semaphore producerSemaphore, Semaphore consumerSemaphore, String name) {
        this.q = q;
        this.maxSize = maxSize;
        this.consumerSemaphore = consumerSemaphore;
        this.producerSemaphore = producerSemaphore;
        this.name = name;
    }


    @Override
    public void run() {

        while(true){
            try {
                consumerSemaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(q.size() > 0){
                System.out.println("Removing element, task-name" + name);
                    q.remove();
                }
            producerSemaphore.release();
        }
    }
}
