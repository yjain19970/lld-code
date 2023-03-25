package liveclass.AdderSubractorV3;

public class LiveClient {
    public static void main(String[] args) throws InterruptedException {
        SharedCount count = new SharedCount();

        AdderTask adderTask = new AdderTask(count);
        SubractorTask subractorTask = new SubractorTask(count);

        Thread t1 = new Thread(adderTask);
        t1.start();

        Thread t2 = new Thread(subractorTask);
        t2.start();

        t1.join();
        t2.join();

        System.out.println("VALUE IS: " + count.getValue());

    }
}
