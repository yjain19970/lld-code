package liveclass.AdderSubractorLock;

import java.util.concurrent.locks.Lock;

public class AdderTask implements Runnable {
    private SharedCount count;
    private Lock lock;

    public AdderTask(SharedCount count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        for(int i=0;i<10000;i++){
            this.count.value += i;
        }
        lock.unlock();
    }
}
