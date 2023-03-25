package liveclass.AdderSubractorV3;

public class SubractorTask implements Runnable {

    private SharedCount count;

    public SubractorTask(SharedCount count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0;i<10000;i++){
                this.count.increamentValue(-i);
        }
    }
}
