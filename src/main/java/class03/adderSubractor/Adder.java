package class03.adderSubractor;

public class Adder implements Runnable {
    private SharedCount sharedCount;

    public Adder(SharedCount sharedCount){
        this.sharedCount = sharedCount;
    }

    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            sharedCount.value += i;
        }

    }
}
