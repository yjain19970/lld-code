package class02.printOneToHundread;

public class PrintNumber implements Runnable {

    private int no;
    public PrintNumber(int no){
        this.no = no;
    }
    @Override
    public void run() {
        System.out.println("Printing: "+no + " Thread name: " + Thread.currentThread().getName());
    }
}
