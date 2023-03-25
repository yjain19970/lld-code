package class03.newAdderSubractor;

public class Subractor implements Runnable {
    private SharedCount count;
    public Subractor(SharedCount count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0;i<100000;i++){
            count.value -= i;
        }
    }
}
