package class03.newAdderSubractor;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        SharedCount sharedCount  = new SharedCount();
        Adder adder = new Adder(sharedCount);
        Subractor subractor = new Subractor(sharedCount);

        Thread t1 = new Thread(adder);
        t1.start();
        Thread t2 =  new Thread(subractor);
        t2.start();


        t1.join();
        t2.join();
        System.out.println("Value of O is: " + sharedCount.value);
    }




}
