package class04.adderSubractorV2;

public class Count {
    private int value=0;

    public synchronized void increamentValue(int offset){
        this.value += offset;
    }

    public int getValue(){
        return this.value;
    }
}
