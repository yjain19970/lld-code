package liveclass.AdderSubractorV3;

public class AdderTask implements Runnable {
    private SharedCount count;

    public AdderTask(SharedCount count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0;i<10000;i++){
                this.count.increamentValue(i);
        }
    }
}
