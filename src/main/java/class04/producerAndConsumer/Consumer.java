package class04.producerAndConsumer;

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
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
        this.name = name;
    }

    @Override
    public void run() {
        while(true){
            try {
                consumerSemaphore.acquire();
                if(q.size() > 0){
                    System.out.println("Removing object to my queue: "+name + "size before adding:"+q.size());
                    q.remove();
                }
                producerSemaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
