package liveclass.AdderSubractorLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LiveClient {
    public static void main(String[] args) throws InterruptedException {
        SharedCount count = new SharedCount();
        Lock lock = new ReentrantLock();

        AdderTask adderTask = new AdderTask(count, lock);
        SubractorTask subractorTask = new SubractorTask(count, lock);

        Thread t1 = new Thread(adderTask);
        t1.start();

        Thread t2 = new Thread(subractorTask);
        t2.start();

        t1.join();
        t2.join();

        System.out.println("VALUE IS: " + count.value);

    }
}
