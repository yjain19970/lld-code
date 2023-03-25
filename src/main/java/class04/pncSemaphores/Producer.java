package class04.pncSemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Queue<Object> q;
    private int maxSize;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;
    private String name;

    public Producer(Queue<Object> q, int maxSize, Semaphore producerSemaphore, Semaphore consumerSemaphore, String name) {
        this.q = q;
        this.maxSize = maxSize;
        this.consumerSemaphore = consumerSemaphore;
        this.producerSemaphore = producerSemaphore;
        this.name = name;
    }

    /**
          DOES PRODUCER NEED TO KNOW ABOUT THE QUEUE? --> Yes.
          Pass it via constructor
         */
    @Override
    public void run() {
        while(true){
            try {
                producerSemaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(q.size() < maxSize){
                System.out.println("Adding element, task-name" + name);
                    q.add(new Object());
                }
            consumerSemaphore.release();
        }
    }
}
