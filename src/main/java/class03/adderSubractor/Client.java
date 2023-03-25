package class03.adderSubractor;

public class Client {

   public static void main(String[] args) throws InterruptedException {
       SharedCount count  = new SharedCount();
       Adder adder =  new Adder(count);
       Subractor subractor = new Subractor(count);

       Thread t1 = new Thread(adder);
       Thread t2 = new Thread(subractor);

       t1.start();
       t2.start();
       // WAIT
      t1.join();
      t2.join();
       System.out.println("VALUE IS " + count.value);


   }

}
