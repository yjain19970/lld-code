package liveclass.AdderSubractorLock;

import java.util.concurrent.locks.Lock;

public class SubractorTask implements Runnable {

    private SharedCount count;
    private Lock lock;

    public SubractorTask(SharedCount count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        for(int i=0;i<10000;i++){
            this.count.value -= i;
        }
        lock.unlock();
    }
    // + 1 +2 -1 +3 -2 ...

    // now
    // +1 +2 +3 +4....+100
    // -1 -2 -3 -4...-100

}
