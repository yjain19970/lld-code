package class02;

public class Client {

    public static void main(String[] args){

        System.out.println("In the main method with thread name: "+ Thread.currentThread().getName());
        HelloWorldPrinter hwp = new HelloWorldPrinter();

        Thread t  = new Thread(hwp);
        t.start(); //

        System.out.println("before closed...."); //

    }
}
