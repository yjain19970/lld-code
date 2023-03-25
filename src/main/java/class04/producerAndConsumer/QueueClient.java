package class04.producerAndConsumer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;

public class QueueClient {

    public static void main(String[] args) {
        Queue<Object> objects = new ConcurrentLinkedDeque<>();
        Semaphore producerSemaphore = new Semaphore(6);
        Semaphore consumerSemaphore = new Semaphore(0);

        Producer p1 = new Producer(objects, 6, producerSemaphore, consumerSemaphore, "p1");
        Producer p2 = new Producer(objects, 6,producerSemaphore, consumerSemaphore, "p2");
        Producer p3 = new Producer(objects, 6,producerSemaphore, consumerSemaphore, "p3");

        Consumer c1 = new Consumer(objects,6,producerSemaphore, consumerSemaphore, "c1");
        Consumer c2 = new Consumer(objects,6,producerSemaphore, consumerSemaphore, "c2");
        Consumer c3 = new Consumer(objects,6,producerSemaphore, consumerSemaphore, "c3");
        Consumer c4 = new Consumer(objects,6,producerSemaphore, consumerSemaphore, "c4");
        Consumer c5 = new Consumer(objects,6,producerSemaphore, consumerSemaphore, "c5");

        // STARTING ALL THE PRODUCERS.
        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.start();

        // STARTING ALL THE CONSUMERS.
        Thread t4 = new Thread(c1);
        t4.start();
        Thread t5 = new Thread(c2);
        t5.start();
        Thread t6 = new Thread(c3);
        t6.start();
        Thread t7 = new Thread(c4);
        t7.start();
        Thread t8 = new Thread(c5);
        t8.start();
    }

}
