package class04.adderSubractorV2;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {

    private Count count;
    private Lock lock;

    public Adder(Count count, Lock lock){
        this.count = count;
        this.lock = lock;
    }


    // WHICH LINES ARE CRITICAL SECTION HERE? lines 15-17.. are they? NO
    // only line 13 is critical section as we modify the data here. FOR LOOP is not part of CS.


    // NOW WHAT WE NEED TO SHARE BETWEEN ADDER AND SUBRACTOR? A LOCK
    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            //synchronized (count){
                count.increamentValue(i);
            //}
            //lock.lock();

           // lock.unlock(); // release
        }
    }
}
