package class04.adderSubractorV2;

import java.util.concurrent.locks.Lock;

public class Subractor implements Runnable{

    private Count count;
    private Lock lock;

    public Subractor(Count count, Lock lock){
        this.count = count;
        this.lock  = lock;
    }

    @Override
    public void run() {

        for(int i=0;i<10000;i++){
            //synchronized (count){
                count.increamentValue(-i);
           // }
            //lock.lock();

            //lock.unlock();
        }
    }
}
