package class04.adderSubractorV2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count coun = new Count();
        Lock lock = new ReentrantLock();


        Adder adder = new Adder(coun, lock);
        Subractor subractor = new Subractor(coun, lock);


        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subractor);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("output is " +coun.getValue());


    }
}
