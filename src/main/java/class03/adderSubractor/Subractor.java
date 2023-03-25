package class03.adderSubractor;

public class Subractor implements Runnable {
    private SharedCount sharedCount;

    public Subractor(SharedCount sharedCount){
        this.sharedCount = sharedCount;
    }

    /**
     *
     */

    @Override
    public void run() {

        for(int i=0;i<10000;i++){
            sharedCount.value -= i;
        }

    }
}
