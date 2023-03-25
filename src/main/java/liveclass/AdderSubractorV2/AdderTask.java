package liveclass.AdderSubractorV2;

import java.util.concurrent.locks.Lock;

public class AdderTask implements Runnable {
    private SharedCount count;

    public AdderTask(SharedCount count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            synchronized (count){
                this.count.value += i;
            }
        }
    }
}
