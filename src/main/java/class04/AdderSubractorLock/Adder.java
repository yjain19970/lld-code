package class04.AdderSubractorLock;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {

    private Count count;


    public Adder(Count count, Lock lock){
        this.count = count;

    }


    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            count.value.addAndGet(i);
        }
    }
}
