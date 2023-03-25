package class02;

public class HelloWorldPrinter implements Runnable {

    public void printName(){
        System.out.println("Inside printName.. " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        printName();
        System.out.println("hello world.. " + Thread.currentThread().getName());
    }
}


/**
 * I want to print 1-100 in separate thread.
 *
 * 1  -- x
 * 2 -- y
 * 3 -- z
 *
 *
 * printing a no is a task...
 */
