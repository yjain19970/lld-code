package class02.printOneToHundread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String []args){
        Executor e = Executors.newCachedThreadPool();
        for(int i=1;i<=100;i++){
            PrintNumber pn = new PrintNumber(i);
           e.execute(pn);
        }
    }
}
