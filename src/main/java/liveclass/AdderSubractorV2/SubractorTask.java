package liveclass.AdderSubractorV2;

import java.util.concurrent.locks.Lock;

public class SubractorTask implements Runnable {

    private SharedCount count;

    public SubractorTask(SharedCount count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            synchronized (count){
                this.count.value -= i;
            }
        }
    }
    // + 1 +2 -1 +3 -2 ...

    // now
    // +1 +2 +3 +4....+100
    // -1 -2 -3 -4...-100

}
